package com.zrf.struts2.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserAction implements SessionAware,ApplicationAware{
	private String username;
	private String pass;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
   public void setUsername(String username) {
		this.username = username;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

public String execute(){
	   session.put("username", username);
	   Integer count=(Integer) application.get("count");
	   if(count==null){
		   count=0;
	   }
	   count++;
	   application.put("count", count);
	   return "login-success";
   }
public String logout(){
	Integer count=(Integer) application.get("count");
	if(count!=null&&count>0){
		count--;
		application.put("count", count);
	}
	((SessionMap)session).invalidate();
	return "logout-success";
}
@Override
public void setSession(Map<String, Object> session) {
	this.session=session;
}

@Override
public void setApplication(Map<String, Object> application) {
	this.application=application;
}
}
