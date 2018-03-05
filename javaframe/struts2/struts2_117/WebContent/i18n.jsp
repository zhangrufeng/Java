<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <s:debug></s:debug>
<%--  <s:form action=""> --%>
<!--     lable的方式是把label写死在标签里 -->
<%--     <s:textfield name="username" label="UserName"></s:textfield> --%>
<!--     
<!-- 			若 label 标签使用 %{getText('username')} 的方式就也可以从国际化资源文件中获取 value 值了  -->
<!-- 			因为此时在对象栈中有 DefaultTextProvider 的一个实例, 该对象中提供了访问国际化资源文件的 getText() 方法 -->
<!-- 			同时还需要通知 struts2 框架 label 中放入的不再是一个普通的字符串, 而是一个 OGNL 表达式. 所以使用 %{} 把 getText() -->
<!-- 			包装起来, 以强制进行 OGNL 解析.  -->
<!-- 		-->
<%--     <s:textfield name="username" label="%{getText('username')}"></s:textfield> --%>
<!--     key的方式是直接在资源文件中获取value值 -->
<%--     <s:textfield name="username" key="username"></s:textfield> --%>
<%--     <s:textfield name="password" key="password"></s:textfield> --%>
<%--     <s:submit key="submit"></s:submit> --%>
<%--  </s:form> --%>
 
 <br><br>
 <s:text name="time">
    <s:param value="date"></s:param>
 </s:text>
  <br><br>
  <s:text name="time2"></s:text>
 <s:form action="" theme="simple">
    <!-- lable的方式是把label写死在标签里 -->
    <!--  
			页面上可以直接使用 <s:text name="" /> 标签来访问国际化资源文件里的 value 值. 
		-->
    <s:text name="username"/>:<s:textfield name="username" label="UserName"></s:textfield>
    <!-- 
			若 label 标签使用 %{getText('username')} 的方式就也可以从国际化资源文件中获取 value 值了 
			因为此时在对象栈中有 DefaultTextProvider 的一个实例, 该对象中提供了访问国际化资源文件的 getText() 方法
			同时还需要通知 struts2 框架 label 中放入的不再是一个普通的字符串, 而是一个 OGNL 表达式. 所以使用 %{} 把 getText()
			包装起来, 以强制进行 OGNL 解析. 
		-->
    <s:text name="username"/>:<s:textfield name="username" label="%{getText('username')}"></s:textfield>
    <!-- key的方式是直接在资源文件中获取value值 -->
    <s:text name="username"/>:<s:textfield name="username" key="username"></s:textfield>
    <s:text name="password"/>:<s:textfield name="password" key="password"></s:textfield>
    <s:submit key="submit" value="%{getText('submit')}"></s:submit>
 </s:form>
</body>
</html>