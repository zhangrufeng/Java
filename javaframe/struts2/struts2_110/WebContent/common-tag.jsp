<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.zrf.struts2.action.Person"%>
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
   <br><br>
  s:set:向 page,request,session,application域对象中加入一个属性值
  <br><br>
  <s:set value="productName" scope="request" var="sn"></s:set>
  productName:${requestScope.sn}
  <br><br>
  <!-- 对value属性值自动的进行OGNL 解析 -->
  <s:set var="pr" value="productName" scope="page"></s:set>
  productName:${pageScope.pr}
  <br><br>
  s:push:把一个对象在标签开始后压入到值栈中，标签结束时，弹出值栈
  <br><br>
  <% 
     Person person=new Person();
     person.setName("zhangsan");
     person.setAge(20);
     request.setAttribute("person", person);
  %>
  <s:push value="#request.person">
    ${name}
  </s:push>
  <br>
   --${name}--
   <br>
   s:if,s:else,s:elseif
   <br><br>
   <!-- 可以直接使用值栈中的属性 -->
   <s:if test="productPrice>1000">
      I7处理器
   </s:if>
   <s:elseif test="productPrice>800">
     I5处理器
   </s:elseif>
   <s:else>
       I3处理器
   </s:else>
    <br>
    <s:if test="#request.person.age>10">
                 大于10岁
    </s:if>
    <s:else>
               小于或等于10岁
    </s:else>
    <br><br>
    s:iterator:遍历集合的，把这个可遍历对象里的每一个元素依次压入和弹出
     <br><br>
     <%
        List<Person>persons=new ArrayList<Person>();
        persons.add(new Person("AA",10));
        persons.add(new Person("BB",20));
        persons.add(new Person("CC",30));
        persons.add(new Person("DD",40));
        persons.add(new Person("EE",50));
        request.setAttribute("persons", persons);
     %>
     <s:iterator value="#request.persons" status="status">
        index:${status.index}-count:${status.count}:${name}--${age}<br>
     </s:iterator>
     <br><br>
      <s:iterator value="persons">
        ${name}--${age}<br>
     </s:iterator>
</body>
</html>