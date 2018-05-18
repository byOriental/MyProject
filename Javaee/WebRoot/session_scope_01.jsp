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
  		session.setAttribute("name", "shanghai");
  		session.setAttribute("birthday", new Date());
  	 %>
  	 <!-- session超链接跳转可以接收属性值,重新打开浏览器不能获取-->
  	 <a href="session_scope_02.jsp">超链接跳转</a>
  </body>
</html>
