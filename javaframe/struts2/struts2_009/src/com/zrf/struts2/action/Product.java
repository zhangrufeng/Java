package com.zrf.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class Product implements RequestAware, SessionAware {
	private Integer productId;
	private String productName;
	private String productDesc;
	private double productPrice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
    public String testTag(){
    	this.productId=1001;
    	this.productName="productName";
    	this.productDesc="desc";
    	this.productPrice=1000;
    	return "success";
    }
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + "]";
	}

	public String save() {
		System.out.println("save:" + this);
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		Test test = new Test();
		test.setProductName("AABB");
		test.setProductDesc("ABAB");
		valueStack.push(test);
		sessionMap.put("product", this);
		requestMap.put("test", test);
		return "success";
	}

	private Map<String, Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	private Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}
}
