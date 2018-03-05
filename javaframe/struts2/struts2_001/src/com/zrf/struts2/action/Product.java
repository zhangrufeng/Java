package com.zrf.struts2.action;

public class Product {
   private Integer productId;
   private String productName;
   private String productDesc;
   private String productPrice;
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
public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName
			+ ", productDesc=" + productDesc + ", productPrice=" + productPrice
			+ "]";
}
   
   public String save(){
	   System.out.println("save: " + this);
	   return "detail";
   }
}
