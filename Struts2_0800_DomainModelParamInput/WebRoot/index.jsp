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
ʹ����ģ��ʱ����������һ��Ҫָ�����,���磺user.name<br>
ʹ��Domain Model���ղ���<a href="user/user!add?user.name=a&user.age=8">����û�</a>
	
</body>
</html>
