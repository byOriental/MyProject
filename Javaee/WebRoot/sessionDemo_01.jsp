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
  		String s=session.getId();
  	 %>
  	 <h1>session值：<%=s %></h1>
  	 <h2>session长度：<%=s.length() %></h2>
  </body>
</html>
