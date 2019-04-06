package com.zh.dao;

import com.zh.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> login(String userid, String password);
}
