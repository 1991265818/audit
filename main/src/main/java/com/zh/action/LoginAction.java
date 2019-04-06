package com.zh.action;

import com.opensymphony.xwork2.ModelDriven;
import com.zh.pojo.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

public class LoginAction implements ModelDriven<User> {
    private Map<String, Object> request;
    private User user;
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    @Override
    public User getModel() {
        this.user = new User();
        return this.user;
    }
    @ResponseBody
    public String login() {
        if(userService.login(user.getUserid(),user.getPassword())){
            return "frame";
        }else {
            return "login";
        }
    }


}
