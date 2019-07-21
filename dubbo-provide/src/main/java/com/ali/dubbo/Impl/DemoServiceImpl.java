package com.ali.dubbo.Impl;

import com.ali.dubbo.DubboDemoService;
import com.alibaba.dubbo.config.annotation.Service;


/**
 *
 */
@Service(interfaceClass = DubboDemoService.class)
public class DemoServiceImpl implements DubboDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
