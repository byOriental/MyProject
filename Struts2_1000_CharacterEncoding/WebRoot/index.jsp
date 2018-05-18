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
使用action属性接收参数，测试中文问题
<form action="user/user!add" method="post">
姓名：<input type="text" name="name"></input>
<input type="submit" value="submit"/>
</form>

	
</body>
</html>
