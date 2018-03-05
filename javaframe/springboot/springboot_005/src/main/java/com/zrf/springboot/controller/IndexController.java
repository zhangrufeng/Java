package com.zrf.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
   @RequestMapping("/index")	
   public String index(ModelMap map){
	   map.addAttribute("name", "李志国");
	   map.put("sex", 1);//0 男 1 女
	   List<String>userList=new ArrayList<String>();
	   userList.add("张三");
	   userList.add("李四");
	   userList.add("王麻子");
	   map.addAttribute("userList",userList);
	   return "index";
   }
}
