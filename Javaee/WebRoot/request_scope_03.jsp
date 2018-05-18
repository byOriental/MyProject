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
  		request.setAttribute("name", "shanghai");
  		request.setAttribute("birthday", new Date());
  	 %>
  	 <!-- request超链接跳转不能接收属性值，相当于再一次请求-->
  	 <a href="request_scope_02.jsp">超链接跳转</a>
  </body>
</html>
