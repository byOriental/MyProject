<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <!-- 地址重写获取参数http://localhost:8080/Javaee/requestDemo_05.jsp?name=beijing&password=123456 -->
	<% 
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
	 %>
	 <h3>名字：<%=name %></h3>
	 <h3>密码：<%=password %></h3>
  <body>
  </body>
</html>
