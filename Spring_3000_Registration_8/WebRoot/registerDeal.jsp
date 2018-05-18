<%@page import="com.by.registration.service.*"%>
<%@page import="com.by.regisration.service.impl.*" %>
<%@page import="com.by.registration.model.Consumer"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String username = request.getParameter("username");
String password = request.getParameter("password");
String password2 = request.getParameter("password2");

Consumer c = new Consumer();
c.setUsername(username);
c.setPassword(password);
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "sunzhihui1997");

ConsumerManager cm = new ConsumerManagerImpl();
boolean exist = cm.exists(c);
if(exist) {
	response.sendRedirect("registerFail.jsp");
	return;
}

cm.add(c);
response.sendRedirect("registerSuccess.jsp");
%>
