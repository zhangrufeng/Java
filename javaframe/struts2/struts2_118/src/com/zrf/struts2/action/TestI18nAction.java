package com.zrf.struts2.action;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestI18nAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date = null;

	@Override
	public String execute() throws Exception {
		date = new Date();
		// 在Action 中访问国际化资源文件的value值
		String username = getText("username");
		System.out.println(username);
		// 带占位符获取
		String time = getText("time", Arrays.asList(date));
		System.out.println(time);
		return SUCCESS;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
