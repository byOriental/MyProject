<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  	<%
  		application.setAttribute("name", "beijing");
  		application.setAttribute("birthday", new Date());
  	 %>
  	<!-- application超链接跳转可以接收属性值,重新打开浏览器获取属性值-->
  	<a href="application_scope_02.jsp">超链接重新定位</a>
  </body>
</html>
