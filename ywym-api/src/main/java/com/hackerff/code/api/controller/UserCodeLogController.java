package com.hackerff.code.api.controller;

import com.hackerff.code.api.service.UserCodeLogService;
import com.hackerff.code.api.service.UserService;
import com.hackerff.code.common.result.CommonPage;
import com.hackerff.code.common.result.CommonResult;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserCodeLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/28 16:12
 */
@RestController
@Api("UserCodeLogController")
@RequestMapping("/")
public class UserCodeLogController {
    @Autowired
    private UserCodeLogService userCodeLogService;
    @Autowired
    private UserService userService;

    @ApiOperation("用户使用过的二维码列表")
    @GetMapping("/user-code-log")
    public CommonResult userCodeLog(@RequestParam(required = false, defaultValue = "1") int page, @RequestParam(required = false, defaultValue = "15") int pageSize) {
        YwymUser user = userService.getCurrentUser();
        List<YwymUserCodeLog> list = userCodeLogService.getLogsByUserId(user.getId(), page, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
