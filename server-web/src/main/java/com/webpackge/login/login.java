package com.webpackge.login;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/1.
 */
@RestController
@RequestMapping(value = "/self/api"+"/login")
@Api(tags="页面登录",description = "页面登录")
public class login {
    @PostMapping(value = "/validator")
    @ApiOperation(value = "登录")
    public void firstLogin(){
        String username = "123";
        String password = "123";

    }
}
