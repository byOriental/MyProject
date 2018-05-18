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
  		String info=pageContext.getRequest().getParameter("info");
  		String realPath=pageContext.getServletContext().getRealPath("/");
  		
  	 %>
  	 <h1>info:<%=info %></h1>
  	 <h1>path:<%=realPath %></h1>
  </body>
</html>
