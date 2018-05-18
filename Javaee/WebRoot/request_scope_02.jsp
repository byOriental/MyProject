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
  		String name=(String)request.getAttribute("name");
  		Date birthday=(Date)request.getAttribute("birthday");
  	 %>
   
   <h3>姓名：<%=name %></h3>
   <h1>生日：<%=birthday %></h1>
  </body>
</html>
