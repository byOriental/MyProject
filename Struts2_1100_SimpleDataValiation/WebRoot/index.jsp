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
ʹ��addFieldError������s:fieldError��ǩ�򵥴�������У��
<a href="user/user!add?name=a" >����û�</a>


	
</body>
</html>
