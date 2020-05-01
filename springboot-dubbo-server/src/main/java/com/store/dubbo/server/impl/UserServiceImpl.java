package com.store.dubbo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.store.dubbo.server.mapper.UserMapper;
import com.store.dubbo.api.model.User;
import com.store.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 实现类
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
