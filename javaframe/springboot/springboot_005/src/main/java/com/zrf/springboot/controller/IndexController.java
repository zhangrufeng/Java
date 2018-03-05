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
	   map.addAttribute("name", "��־��");
	   map.put("sex", 1);//0 �� 1 Ů
	   List<String>userList=new ArrayList<String>();
	   userList.add("����");
	   userList.add("����");
	   userList.add("������");
	   map.addAttribute("userList",userList);
	   return "index";
   }
}
