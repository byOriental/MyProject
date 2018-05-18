<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<base href="<%=basePath %>"/>
<title>Insert title here</title>
</head>
<body>
使用action属性接收参数<a href="user/user!add?name=a&age=8">添加用户</a>
	
</body>
</html>
