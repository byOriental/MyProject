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
动态结果
一定不要忘了为动态结果的保存值设置set get方法
<ol>
	<li><a href="user/user?type=1">返回success</a></li>
	<li><a href="user/user?type=2">返回error</a></li>
</ol>
	
</body>
</html>
