<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String contextPath = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+contextPath+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
</head>
<body>
	∑√Œ  Ù–‘
	<a href="<%=contextPath %>/tags.action?username=u&password=p">tags</a>
</body>
</html>
