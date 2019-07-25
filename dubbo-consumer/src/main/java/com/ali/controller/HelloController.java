package com.ali.controller;

import com.ali.dubbo.DubboDemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHUJIANFENG on 2019/7/21.
 */
@RestController(value = "/dubbo")
public class HelloController {

    @Reference(version = "1.0.0")
    DubboDemoService dubboDemoService;

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return dubboDemoService.sayHello(name);
    }

}
