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
  		String p=application.getRealPath("/");//"/"作为参数可以获得真实路径
  		//this.getServletContext().getRealPath("/");同上一样
   %>
   <h2>真实路径：<%=p %></h2>
  </body>
</html>
