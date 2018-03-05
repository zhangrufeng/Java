<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <s:debug></s:debug>
  <br>
  s:property:打印值栈中的属性值的：对于对象栈，打印值栈中对应的属性值
  <br><br>
  <s:property value="productName"/><br><br>
  对于Map栈，打印request,session,application的某个属性值或某个请求参数的值<br><br>
  <s:property value="#session.date"/><br>
  <s:property value="#parameters.name[0]"/>
  <br><br>
  s:url:创建一个URL 字符窜<br><br>
  <s:url value="/testUrl" var="url"></s:url>
  ${url}<br><br>
  <s:url value="/getProduct" var="url1">
     <!-- 指定url包含的请求参数，2002不可能是一个属性名，struts2把2002直接作为属性值 -->
    <s:param name="productId" value="2002"></s:param>
  </s:url>
  ${url1}
  <br><br>
  <s:url value="/getProduct" var="url2">
    <!-- 对于value值会自动的解析ONGL -->
    <s:param name="productId" value="productId"></s:param>
    <s:param name="date" value="#session.date"></s:param>
  </s:url>
  ${url2}
  <br><br>
  <s:url value="/getProduct" var="url3">
    <!-- 对于value 值会自动的进行OGNL解析，若不希望进行OGNL解析，则使用单引号括起来 -->
    <s:param name="productId" value="'abighouse'"></s:param>
  </s:url>
  ${url3}
  <br><br>
  <!-- 构建一个请求action的地址 -->
  <s:url action="testAction" namespace="/helloWord" method="save" var="url4"></s:url>
  ${url4}
   <br><br>
    <!-- includeParams获取get请求参数 -->
   <s:url value="testUrl" var="url5" includeParams="get"></s:url>
     ${url5}
     <br><br>
     <!-- includeParams获取post请求参数 -->
  <s:url value="testUrl" var="url6" includeParams="all"></s:url>
     ${url6}   
</body>
</html>