<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <!-- 对客户端的请求进行回应 -->
  <body>
  	<%!
  		int count=0;  //定义全局变量
  	 %>
  	 <%
  	 	response.addHeader("refresh", "2");
  	  %>
  	  <h3>已经访问了<%=count++ %>次</h3>
  </body>
</html>
