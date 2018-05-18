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
  	 
  	 <jsp:forward page="application_scope_02.jsp"/>
  </body>
</html>
