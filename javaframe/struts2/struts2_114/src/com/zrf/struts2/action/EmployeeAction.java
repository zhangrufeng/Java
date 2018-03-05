package com.zrf.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.zrf.struts2.bean.Dao;
import com.zrf.struts2.bean.Employee;

public class EmployeeAction implements RequestAware,ModelDriven<Employee>,Preparable {
	private Dao dao = new Dao();
	private Map<String, Object> requestMap = null;
	private Employee employee;
    private Integer employeeId;
//	private String firstName;
//	private String lastName;
//	private String email;

	public String list() {
		requestMap.put("emps", dao.getEmployees());
		return "list";
	}

	public String delete() {
//		dao.delete(employee.getEmployeeId());
		dao.delete(employeeId);
		return "success";
	}

	public String save() {
//		Employee employee=new Employee(null,firstName,lastName,email);
		dao.save(employee);
		return "success";
	}
	public String edit(){
//		Employee emp=dao.get(employee.getEmployeeId());
//		employee.setFirstName(emp.getFirstName());
//		employee.setLastName(emp.getLastName());
//		employee.setEmail(emp.getEmail());
//		ActionContext.getContext().getValueStack().push(employee=dao.get(employee.getEmployeeId()));
		
		return "edit";
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;

	}
	
	@Override
	public Employee getModel() {
//		if(employee==null){
//			employee=new Employee();
//		}else{
//			employee=dao.get(employeeId);
//		}
		return employee;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFistName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	@Override
	public void prepare() throws Exception {
		if(employee==null){
			employee=new Employee();
		}else{
			employee=dao.get(employeeId);
		}
	}
}
