package com.zrf.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zrf.springboot.entity.EmpEntity;
import com.zrf.springboot.mapper.EmpMapper;
import com.zrf.springboot.service.EmpService;

@Controller
public class IndexController {
	@Autowired
	private EmpMapper  empMapper;
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/index")
    public String index(){
    	return "index";
    }
	@ResponseBody
	@RequestMapping("/getEmpName")
	public EmpEntity getEmpName(String name){
		return empMapper.findName(name);
	}
	@ResponseBody
	@RequestMapping("/insertEmp")
	public String insertEmp(String name,String email,String hiredate){
		empService.addEmp(name, email, hiredate);
		return "success";
	}
	
}
