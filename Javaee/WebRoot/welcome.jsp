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
  		if(session.getAttribute("user")!=null){
   %>
   		<h1>欢迎<%=session.getAttribute("user") %>,<a href="loginout.jsp">注销</a></h1>
  <%
  }else{
   %>
   		<h2>先进行系统<a href="login.jsp">登录</a></h2>
   <%
   }
    %>
  </body>
</html>
