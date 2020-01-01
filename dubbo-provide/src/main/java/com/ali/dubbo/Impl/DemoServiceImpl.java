package com.ali.dubbo.Impl;

import com.ali.dubbo.DubboDemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 *
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DubboDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
