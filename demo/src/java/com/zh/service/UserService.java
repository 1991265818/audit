package com.zh.service;

public interface UserService {
    public int login(String username, String password);

    public int add(String username,String password,String card,String add);
}
