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
  		String driver=config.getInitParameter("driver");
  		String url=config.getInitParameter("url");
  		
   %>
   <h1>驱动名称：<%=driver %></h1>
   <h2>驱动地址：<%=url %></h2>
  </body>
</html>
