package com.zrf.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * 加载两个controller
 *
 */
@EnableAutoConfiguration
//自动扫描包
@ComponentScan(basePackages="com.zrf.springboot.controller")
public class App {
   public static void main(String[] args) {
	 SpringApplication.run(App.class, args);
}
}
