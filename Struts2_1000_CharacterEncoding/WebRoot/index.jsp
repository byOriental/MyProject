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
ʹ��action���Խ��ղ�����������������
<form action="user/user!add" method="post">
������<input type="text" name="name"></input>
<input type="submit" value="submit"/>
</form>

	
</body>
</html>
