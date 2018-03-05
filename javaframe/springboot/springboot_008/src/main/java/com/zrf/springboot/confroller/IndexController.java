package com.zrf.springboot.confroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zrf.springboot.entity.EmpEntity;
import com.zrf.springboot.mapper.EmpMapper;

@Controller
public class IndexController {
	@Autowired
	private EmpMapper  empMapper;
	
	@RequestMapping("/index")
    public String index(){
    	return "index";
    }
	@ResponseBody
	@RequestMapping("/getEmpName")
	public EmpEntity getEmpName(String name){
		return empMapper.findName(name);
	}
}
