package com.webpackge.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/9.
 */
@RestController
@Api(description = "测试导入功能",value = "测试导入功能")
public class TestImport {
    @RequestMapping("test")
    @ApiOperation(value = "问候",notes = "问候")
    public void sayHi(String name){
        System.out.println("你好！"+name);
    }
}
