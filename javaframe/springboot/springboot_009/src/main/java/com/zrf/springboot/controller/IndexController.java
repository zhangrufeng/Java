package com.zrf.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrf.springboot.entity.EmpEntity;
import com.zrf.springboot.repository.EmpRepository;

@RestController
public class IndexController {
	@Autowired
	private EmpRepository empRepository;
   @RequestMapping("/index")
   public String index(Integer id){
	   EmpEntity  empEntity =empRepository.findOne(id);
	   return empEntity.toString();
   }
}
