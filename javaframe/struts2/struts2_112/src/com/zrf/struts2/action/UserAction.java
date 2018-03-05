package com.zrf.struts2.action;

import java.util.Arrays;
import java.util.List;

public class UserAction {
	private Integer userId;
	private String userName;
	private String password;
	private String Desc;
	private boolean married=true;
	private String gender;
	private List<String>city;
	private String age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
    
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserAction [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", Desc=" + Desc + ", married="
				+ married + ", gender=" + gender + ", city=" + city + ", age="
				+ age + "]";
	}

	public String save() {
		System.out.println(this);
		UserAction ua = new UserAction();
		ua.setUserId(1001);
		ua.setUserName("zrf");
		ua.setPassword("112233");
		ua.setDesc("JAVA");
//		ActionContext.getContext().getValueStack().push(ua);
		return "input";
	}
}
