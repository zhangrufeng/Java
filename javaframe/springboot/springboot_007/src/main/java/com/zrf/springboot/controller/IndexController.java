package com.zrf.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrf.springboot.service.EmpService;

@RestController
public class IndexController {
   @Autowired	
   private EmpService empService;
   
   @RequestMapping("/index")
   public String index(){
	   empService.createJdbcEmp();
	   return "add success";
   }
}
