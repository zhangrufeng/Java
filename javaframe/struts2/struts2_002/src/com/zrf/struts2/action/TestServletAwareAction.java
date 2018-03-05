package com.zrf.struts2.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

/**
 * 通过实现ServletxxxAware接口的方式可以由Struts2注入需要的Servlet相关的对象
 * ServletRequestAware:注入HttpServletRequest 对象
 * ServletContextAware:注入ServletContext 对象
 * ServletResponseAware:注入HttpServletResponse 对象
 * 
 */
public class TestServletAwareAction implements ServletRequestAware,
		ServletContextAware, ServletResponseAware {
	public String execute() throws IOException {
		request.setAttribute("requestKey", "requestValue");
		context.setAttribute("servletContextKey", "servletContextValue");
		// response.sendRedirect("success.jsp");
		return "success";
	}

	private HttpServletRequest request;
	private ServletContext context;
	private HttpServletResponse response;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		System.out.println(request);
		this.request = request;
	}

	@Override
	public void setServletContext(ServletContext context) {
		System.out.println(context);
		this.context = context;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		System.out.println(response);
		this.response = response;
	}
}
