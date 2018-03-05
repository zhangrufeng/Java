package com.zrf.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String,Object>exceptionHandler(){
		Map<String,Object>result=new HashMap<String,Object>();
		result.put("code", "500");
		result.put("msg", "亲，系统错误,请稍后重试....");
		return result;
	}
}
