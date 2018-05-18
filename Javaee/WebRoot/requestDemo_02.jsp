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
		//request.setCharacterEncoding("utf-8");
		String name=(String)request.getAttribute("name");
		String country=(String)request.getAttribute("country");
		
	 %>
	 <h4>名称：<%=name %></h4>
	 <h2>国家：<%=country %></h2>
  </body>
</html>
