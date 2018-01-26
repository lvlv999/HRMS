package com.cn.service;

import com.cn.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUserList();
}
