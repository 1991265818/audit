package com.zh.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"com.zh.controller","com.zh.service"})
@MapperScan(basePackages={"com.zh.mapper"})
@EnableAutoConfiguration
public class App {
//从inv/main进入初始页面
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
