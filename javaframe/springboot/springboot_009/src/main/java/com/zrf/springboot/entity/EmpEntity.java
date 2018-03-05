package com.zrf.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="employee")
public class EmpEntity {
	@GeneratedValue
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String hiredate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", name=" + name + ", email=" + email
				+ ", hiredate=" + hiredate + "]";
	}
	
	
  
}
