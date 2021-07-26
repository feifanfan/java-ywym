package com.hackerff.code.api.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.hackerff.code.api.config.WxMaConfig;
import com.hackerff.code.api.service.MiniappService;
import com.hackerff.code.api.service.UserService;
import com.hackerff.code.common.result.CommonResult;
import com.hackerff.code.model.YwymMiniapp;
import com.hackerff.code.model.YwymUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 10:10
 */
@RestController
@RequestMapping("/wx/user/{appid}")
@Api(tags = "WxMaUserController")
public class WxMaUserController {

    @Autowired
    private UserService userService;
    @Autowired
    private MiniappService miniappService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @GetMapping("/login")
    @ApiOperation("登录注册")
    public CommonResult login(@PathVariable String appid, String code) {
        if (StringUtils.isBlank(code)) {
            return CommonResult.failed("empty code");
        }
        final WxMaService wxMaService = WxMaConfig.getMaService(appid);
        try {
            WxMaJscode2SessionResult sessionResult = wxMaService.getUserService().getSessionInfo(code);
            //获取公众号id
            YwymMiniapp miniapp = miniappService.getMiniAppByAppid(appid);
            //获取到用户openid
            YwymUser user = userService.getUserByOpenidAndAppid(sessionResult.getOpenid(),miniapp.getId());
            if(user == null){
                //TODO 注册用户
                userService.insertUser(sessionResult.getOpenid(),miniapp.getId());
            }
            String token = userService.login(sessionResult.getOpenid());
            Map<String,String> tokenMap = new HashMap<>();
            tokenMap.put("token",token);
            tokenMap.put("tokenHead",tokenHead);
            return CommonResult.success(tokenMap);
        } catch (WxErrorException e) {
            return CommonResult.failed(e.toString());
        }
    }

    @ApiOperation("解密用户信息")
    @GetMapping("/info")
    public CommonResult info(@PathVariable String appid, String sessionKey,
                       String signature, String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfig.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return CommonResult.failed("user check failed");
        }

        // 解密用户信息
        WxMaUserInfo userInfo = wxService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        return CommonResult.success(userInfo);
    }

   @ApiOperation("绑定手机号")
    @GetMapping("/phone")
    public CommonResult phone(@PathVariable String appid, String sessionKey, String signature,
                        String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfig.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return CommonResult.failed("user check failed");
        }

        // 解密
        WxMaPhoneNumberInfo phoneNoInfo = wxService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);

        return CommonResult.success(phoneNoInfo);
    }

    @ApiOperation("获取用户信息")
    @GetMapping("/userInfo")
    public CommonResult userInfo(Principal principal){
        if(principal==null){
            return CommonResult.unauthorized(null);
        }
        YwymUser user = userService.getCurrentUser();
        return CommonResult.success(user);
    }

    @ApiOperation("设置用户信息")
    @PostMapping("/userInfo")
    public CommonResult setUserInfo(@RequestBody Map<String,String> params){
        YwymUser currentUser = userService.getCurrentUser();
        currentUser.setAvatarUrl(params.get("avatarUrl"));
        currentUser.setCity(params.get("city"));
        currentUser.setCountry(params.get("country"));
        currentUser.setGender(Integer.parseInt(params.get("gender")));
        currentUser.setUsername(params.get("nickName"));
        userService.setUserInfo(currentUser);
        return CommonResult.success(currentUser);
    }

}
