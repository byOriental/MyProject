<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  	 <%
  	 	request.setAttribute("name", "hongkong");
  	 	request.setAttribute("country", "中国");
  	  %>
  	  <jsp:forward page="requestDemo_02.jsp"/>
  <body>
  </body>
</html>
