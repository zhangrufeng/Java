<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <a href="TestActionContext.action?name=zhangsan">Test ActionContext</a><br><br>
   <a href="TestAware.action?name=lisi">Test Aware</a><br><br>
   <a href="TestServlet.action">Test Servlet</a><br><br>
   <a href="TestServletAware.action">Test ServletAware</a>
   <% 
      if(application.getAttribute("date")==null){
    	  application.setAttribute("date", new Date()); 
      }
      
   %>
</body>
</html>