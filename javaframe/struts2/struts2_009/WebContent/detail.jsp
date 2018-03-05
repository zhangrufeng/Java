<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <s:debug></s:debug><br><br>
     productName:<s:property value="[0].productName"/><br><br>
     productDesc:<s:property value="[1].productDesc"/><br><br>
     productPrice:<s:property value="[0].productPrice"/><br><br>
     productName1:${sessionScope.product.productName}
     <s:property value="#session.product.productName"/>
     <br><br>
     productName2:${requestScope.test.productName}
     <s:property value="#request.test.productName"/><br><br>
     <s:property value="@java.lang.Math@PI"/><br><br>
     <s:property value="@java.lang.Math@cos(0)"/><br><br>
     <!--调用对象栈的方法为一个属性赋值  -->
     <s:property value="setProductName('changanqu')"/>
     <s:property value="ProductName"/>
     <!-- 调用数组对象名称 -->
     <% 
        String[]str=new String[]{"aa","bb","cc","dd"};
        request.setAttribute("str", str);
     %>
      <br><br>
     length:<s:property value="#attr.str.length"/>
     <br><br>
     str[2]:<s:property value="#attr.str[2]"/>
     <%
       Map<String,String>map=new HashMap<String,String>();
       request.setAttribute("map", map);
       map.put("AA", "a");
       map.put("BB", "b");
       map.put("CC", "c");
     %>
     <br><br>
     <!--使用OGNL访问Map  -->
     <s:property value="#attr.map.size"/><br><br>
     AA:<s:property value="#attr.map['AA']"/>
</body>
</html>