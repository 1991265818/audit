package com.zh.service;

import com.zh.dao.UserDao;
import com.zh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Override
    public User login(String userid, String password) {
        return userDao.login(userid,password);
    }
}
