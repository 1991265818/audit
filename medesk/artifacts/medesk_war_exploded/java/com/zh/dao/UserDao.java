package com.zh.dao;

import com.zh.pojo.User;

import java.util.List;

public interface UserDao {
    //用户登录进行判断
    public User login(String userid, String password);
}
