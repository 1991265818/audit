package com.zh.controller;

import com.zh.pojo.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( "/login")
    @ResponseBody
    public String login(String  userName,String password) {
        System.out.print(userName+password);
        int userlogin = userService.login(userName, password);
        if (userlogin > 0) {
            return "登陆成功";
        } else {
              return "登陆失败";
        }

    }
    @RequestMapping( "/add")
    @ResponseBody
    public String add(String  userName,String password,String card,String add) {
        int useradd = userService.add(userName, password,card,add);
        if (useradd < 0) {
            return "注册失败";
        } else {
            return "注册成功";
        }

    }
}
