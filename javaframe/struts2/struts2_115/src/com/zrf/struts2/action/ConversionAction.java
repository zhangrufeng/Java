package com.zrf.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConversionAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String execute() {
		System.out.println("age:"+age);
		return "success";
	}
}
