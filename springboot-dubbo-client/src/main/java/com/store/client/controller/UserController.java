package com.store.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.store.base.model.User;
import com.store.base.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
}
