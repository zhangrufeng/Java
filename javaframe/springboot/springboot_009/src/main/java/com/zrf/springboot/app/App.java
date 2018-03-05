package com.zrf.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages="com.zrf.springboot.controller")
@EnableJpaRepositories(basePackages="com.zrf.springboot.repository")
@EntityScan("com.zrf.springboot.entity")
public class App {
   public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
