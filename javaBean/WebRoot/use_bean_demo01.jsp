<%@page import="javaee.bean.SimpleBean"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="javaee.bean.*" %>
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
  		SimpleBean sb=new SimpleBean();
  		sb.setName("beijing");
  		sb.setAge(100);
   %>
   <h1>地名:<%=sb.getName() %></h1>
   <h1>历史:<%=sb.getAge() %></h1>
  </body>
</html>
