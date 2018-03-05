package com.zrf.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware, SessionAware,
		RequestAware, ParameterAware {
	public String execute() {
		// 1、application
		application.put("applicationKey2", "applicationValue2");
		System.out.println(application.get("date"));
		// 2、session
		session.put("sessionKey2", "sessionValue2");
		// 3、request
		request.put("requestKey2", "requestValue2");
		
		String[] name=parameters.get("name");
		System.out.println("name:"+name[0]);
		return "success";
	}

	@SuppressWarnings("unused")
	private Map<String, Object> application;
	private Map<String, String[]> parameters;
	private Map<String, Object> request;
	private Map<String, Object> session;

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setParameters(Map<String, String[]> parameters) {
		this.parameters=parameters;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
