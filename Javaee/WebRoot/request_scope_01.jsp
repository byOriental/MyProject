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
  	 <!-- 跳转接收属性值 -->
  	 <jsp:forward page="request_scope_02.jsp"/>
  </body>
</html>
