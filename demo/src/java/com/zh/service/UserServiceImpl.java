package com.zh.service;

import com.zh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public int login(String username, String password){
        return userMapper.login(username,password);
    }
    public int add(String username,String password,String card,String add){
        return userMapper.add(username,password,card,add);
    }
}
