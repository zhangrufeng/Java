package com.zrf.springboot.app;

import org.springframework.boot.SpringApplication;
/**
 * 异常处理
 */
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan(basePackages="com.zrf.springboot.controller")
public class App {

	public static void main(String[] args) {
      SpringApplication.run(App.class, args);
	}

}
