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
ʹ��action���Խ��ղ���<a href="user/user!add?name=a&age=8">����û�</a>
	
</body>
</html>
