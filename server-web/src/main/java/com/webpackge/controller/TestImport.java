package com.webpackge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/9.
 */
@RestController
public class TestImport {
    @RequestMapping("test")
    public void sayHi(String name){
        System.out.println("你好！"+name);
    }
}
