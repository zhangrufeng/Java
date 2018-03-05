package com.zrf.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.zrf.springboot.controller","com.zrf.springboot.service"})
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
         SpringApplication.run(App.class, args);
	}

}
