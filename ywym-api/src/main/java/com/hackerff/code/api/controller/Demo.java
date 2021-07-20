package com.hackerff.code.api.controller;

import com.hackerff.code.api.service.UserService;
import com.hackerff.code.model.YwymUsers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "DemoController")
@RestController
@RequestMapping("demo")
public class Demo {

    @Autowired
    private UserService userService;

    @ApiOperation("测试swagger")
    @GetMapping("test")
    public String  test(){
        return "111";
    }

    @GetMapping("users")
    public YwymUsers users (){
        return userService.user();
    }

}
