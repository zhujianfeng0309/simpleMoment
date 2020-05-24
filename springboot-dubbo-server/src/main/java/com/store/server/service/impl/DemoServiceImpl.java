package com.store.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.store.base.service.DemoService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
