package com.zrf.struts2.action;

public class Test {
  private String productName;
  private String productDesc;
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
@Override
public String toString() {
	return "Test [productName=" + productName + ", productDesc=" + productDesc
			+ "]";
}
}
