package com.zh.service;

import com.zh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Override
    public boolean login(String userid, String password) {
        return userDao.login(userid,password).size()>0;
    }
}
