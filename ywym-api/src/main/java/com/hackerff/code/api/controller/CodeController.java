package com.hackerff.code.api.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.hackerff.code.api.service.CodeService;
import com.hackerff.code.api.service.UserCodeLogService;
import com.hackerff.code.api.service.UserCodeService;
import com.hackerff.code.api.service.UserService;
import com.hackerff.code.common.result.CommonResult;
import com.hackerff.code.common.result.IErrorCode;
import com.hackerff.code.common.result.ResultCode;
import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserCode;
import com.hackerff.code.model.YwymUserCodeLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/27 10:43
 */

@Api(tags = "UserCodeController")
@RestController
//@RequestMapping("")
public class CodeController {

    @Autowired
    private CodeService codeService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserCodeService userCodeService;
    @Autowired
    private UserCodeLogService userCodeLogService;

    @ApiOperation("创建个人二维码")
    @PostMapping("/code")
    public CommonResult userCode(@RequestBody YwymUserCode userCode) {
        YwymUser user = userService.getCurrentUser();
        userCode.setUserId(user.getId());
        YwymCode code = codeService.createCode(userCode);
        return CommonResult.success(code);
    }

    @ApiOperation("二维码详情")
    @GetMapping("/code/{id}")
    public CommonResult<Object> codeDetail(@PathVariable int id, @RequestParam(required = false) String password) {
        YwymCode code = codeService.getCodeById(id);
        //个人二维码
        if (code.getCompanyId() == 0) {
            return userCode(code, password);
        } else {
            //TODO 企业二维码

        }

        return CommonResult.failed("未知错误");
    }

    //个人码
    private CommonResult<Object> userCode(YwymCode code, String password) {
        YwymUserCode userCode = userCodeService.getUserCodeByCodeId(code.getId());
        if (!userCode.getPassword().equals("") && password == null) {
            return CommonResult.failed(ResultCode.FORBIDDEN, "请输入密码！");
        }
        if (!userCode.getPassword().equals("")&&!userCode.getPassword().equals(SecureUtil.md5(password))) {
            return CommonResult.failed(ResultCode.FORBIDDEN, "密码错误！");
        }
        if (userCode.getCloseTime() != null && new Date().after(userCode.getCloseTime())) {
            return CommonResult.failed(ResultCode.FAILED, "二维码已过期！");
        }
        insertUserCodeLog(code);

        Map<String, Object> map = new HashMap<>();

        map.put("code", code);
        map.put("code_detail", userCode);

        return CommonResult.success(map);
    }

    //插入个人记录表
    private void insertUserCodeLog(YwymCode code) {
        YwymUser user = userService.getCurrentUser();
        YwymUserCodeLog userCodeLog = userCodeLogService.getLogByUserIdAndCodeId(user.getId(),code.getId());
        if (userCodeLog==null){
            userCodeLogService.insertLog(user,code);
        }
        return;
    }
}


