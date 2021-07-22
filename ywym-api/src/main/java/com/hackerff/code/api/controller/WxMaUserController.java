package com.hackerff.code.api.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.hutool.json.JSONUtil;
import com.hackerff.code.api.config.WxMaConfig;
import com.hackerff.code.common.result.CommonResult;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/22 10:10
 */
@RestController
@RequestMapping("/wx/user/{appid}")
public class WxMaUserController {
    @GetMapping("/login")
    public CommonResult login(@PathVariable String appid, String code) {
        if (StringUtils.isBlank(code)) {
            return CommonResult.failed("empty code");
        }
        final WxMaService wxMaService = WxMaConfig.getMaService(appid);
        try {
            WxMaJscode2SessionResult sessionResult = wxMaService.getUserService().getSessionInfo(code);
            return CommonResult.success(sessionResult);
        } catch (WxErrorException e) {
            return CommonResult.failed(e.toString());
        }
    }
}
