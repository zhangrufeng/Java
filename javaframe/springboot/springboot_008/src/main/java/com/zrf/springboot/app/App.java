package com.zrf.springboot.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.zrf.springboot.confroller")
@MapperScan(basePackages="com.zrf.springboot.mapper")
@EnableAutoConfiguration
public class App {
     public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
