<%@page import="com.by.registration.service.ConsumerManager"%>
<%@page import="com.by.registration.model.Consumer"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
  </head>
  
  <body>
 <%
 	String username=request.getParameter("username");
 	String password=request.getParameter("password");
 	String password2=request.getParameter("password2");
 	
 	Consumer c = new Consumer();
 	c.setUsername(username);
 	c.setPassword(password);
 	ConsumerManager cm = new ConsumerManager();
 	if(cm.exists(c)){
 		response.sendRedirect("registerFail.jsp");
 		return;
 	}
 	cm.add(c);
 	response.sendRedirect("registerSuccess.jsp");
	%>   
  </body>
</html>
