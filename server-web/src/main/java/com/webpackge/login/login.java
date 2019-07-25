package com.webpackge.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/1.
 */
@RestController
@RequestMapping(value = "/self/api"+"/login")
public class login {
    @PostMapping(value = "/validator")
    public void firstLogin(){
        String username = "123";
        String password = "123";

    }
}
