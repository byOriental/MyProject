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
Result类型
<ol>
	<li><a href="r/r1">dispatcher</a></li><!-- 服务器跳转 -->
	<li><a href="r/r2">redirect</a></li><!-- 客户端跳转 -->
	<li><a href="r/r3">chain</a></li><!-- 服务器跳转 -->
	<li><a href="r/r4">redirectAction</a></li><!-- 客户端跳转 -->
	<li>freemarker</li>
	<li>httpheader</li>
	<li>stream</li>
	<li>velocity</li>
	<li>xslt</li>
	<li>plaintext</li>
	<li>tiles</li>
</ol>
	
</body>
</html>
