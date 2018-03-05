package com.zrf.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RestController:springboot提供了http refult风格
 * @RestController==Controller每个方法上面加上@ResponseBody
 * @ResponseBody 返回所有请求方法返回json格式
 * @author Administrator
 *
 */
@RestController
@EnableAutoConfiguration
public class TestController {
    
	@RequestMapping("/hello")
	public String hello(){
		return "success";
	}
	public static void main(String[] args) {
		//运行
		SpringApplication.run(TestController.class, args);
	}
}
