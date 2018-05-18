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
  		String method=request.getMethod();
  		String ip=request.getRemoteAddr();
  		String pt=request.getServletPath();//  /requestDemo_06.jsp
  		String ct=request.getContextPath();//  /Javaee
  	 %>
  	 <h1>方法：<%=method %></h1>
  	 <h1>地址：<%=ip %></h1>
  	 <h1>路径：<%=pt %></h1>
  	 <h1>资源：<%=ct %></h1>
  </body>
</html>
