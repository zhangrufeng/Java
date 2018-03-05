<%@page import="com.zrf.struts2.action.City"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<%
     List<City>citys=new ArrayList<City>();
     citys.add(new City(1001,"AA"));
     citys.add(new City(1002,"BB"));
     citys.add(new City(1003,"CC"));
     citys.add(new City(1004,"DD"));
     request.setAttribute("citys", citys);
   %>
   <!-- 
      表单标签
   1.使用和html的from标签感觉差不多
   2.Struts2的form标签会生成一个table,以进行自动的排版
   3.可以对表单提交的值进行回显:从栈顶对象开始匹配属性，并把匹配的属性值赋值到对应的标签的value中，若栈顶对象没有对应的属性，
       则依次向下找相应对应的属性   
    -->
   <s:form action="save" method="ppost">
     <s:hidden name="userId"></s:hidden>
     <s:textfield name="userName" label="UserName"></s:textfield>
     <s:password name="password" label="Password"></s:password>
     <s:textfield name="desc" label="Desc"></s:textfield>
     <s:checkbox name="married" label="Married"></s:checkbox>
     <s:radio list="#{'1':'Male','0':'FeMale'}" label="Gender" name="gender"></s:radio>
     <!-- 
                  服务端需要使用集合类型，以保证能够被正常的回显！
      -->
     <s:checkboxlist list="#request.citys" listKey="cityId" listValue="cityName" label="City" name="city"></s:checkboxlist>
     <s:select list="{11,12,13,14,15,16,17,18,19,20}" headerKey="" headerValue="请选择" name="age" label="Age">
        <!-- 
           s:optgroup 可以用做s:select的子标签，用于显示更多的下拉框
                                注意：必须有键值对，而不能使用一个集合，让其值作为键，又作为值。
         -->
       <s:optgroup label="21-30" list="#{21:21,222:333}"></s:optgroup>
       <s:optgroup label="31-40" list="#{31:31}"></s:optgroup>
     </s:select> 
     <s:submit></s:submit>
   </s:form>
   <form action="save" method="post">
      Married:<input type="checkbox" name="married">
      <input type="submit" value="Submit">
   </form>
   <br><br>
   
</body>
</html>