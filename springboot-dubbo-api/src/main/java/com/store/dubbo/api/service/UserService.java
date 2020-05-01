package com.store.dubbo.api.service;


import com.store.dubbo.api.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
