package com.cn.dao;

import com.cn.model.User;

import java.util.List;

public interface UserMapper {
    void addUser(User user);
    List<User> getUserList();
}
