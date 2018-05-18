<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
<body> 
使用域模型时，对象属性一定要指明清楚,比如：user.name<br>
使用Domain Model接收参数<a href="user/user!add?user.name=a&user.age=8">添加用户</a>
	
</body>
</html>
