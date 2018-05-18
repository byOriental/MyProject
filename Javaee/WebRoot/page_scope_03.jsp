<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
  		String name=(String)pageContext.getAttribute("name");
  		int age=(int)pageContext.getAttributesScope("age");
  	 %>
  	 <h1>姓名：<%=name %></h1>
 	 <h1>姓名：<%=age %></h1>
  </body>
</html>
