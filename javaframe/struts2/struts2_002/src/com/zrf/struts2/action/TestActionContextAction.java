package com.zrf.struts2.action;

import java.util.Map;

import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {

	public String execute() {
		// 0. 获取 ActionContext 对象
		ActionContext actionContext = ActionContext.getContext();
		//1. 获取 application 对应的 Map, 并向其中添加一个属性
		//通过调用 ActionContext 对象的 getApplication() 方法来获取 application 对象的 Map 对象
		Map<String, Object> applicationMap = actionContext.getApplication();
		//设置属性
		applicationMap.put("applicationKey", "applicationValue");
		//获取属性
		Object date=applicationMap.get("date");
		System.out.println("date:"+date);
		
		//2.session
		Map<String, Object>sessionMap=actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		System.out.println(sessionMap.getClass());
		if(sessionMap instanceof SessionMap){
			SessionMap sm=(SessionMap)sessionMap;
			sm.invalidate();
			System.out.println("session失效了");
		}
		//3.request
		//ActionContext 中并没有提供 getRequest 方法来获取 request 对应的 Map,需要手工调用 get() 方法, 传入 request 字符串来获取. 
		@SuppressWarnings("unchecked")
		Map<String, Object>requestMap=(Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestVlue");
		//4. 获取请求参数对应的 Map, 并获取指定的参数值. 
		Map<String, Parameter>parameters=actionContext.getParameters();
		System.out.println(parameters.get("name"));
		return "success";
	}
}
