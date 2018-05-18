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
 	
 	Class.forName("com.mysql.jdbc.Driver");
 	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "sunzhihui1997");
 	String sqlQuery="select count(*) from consumer where username=?";
 	PreparedStatement psQuery=conn.prepareStatement(sqlQuery);
 	psQuery.setString(1, username);
 	ResultSet rs=psQuery.executeQuery();
 	rs.next();
 	int count=rs.getInt(1);
 	//如果存在注册过的用户
 	if(count > 0) {
	response.sendRedirect("registerFail.jsp");
	psQuery.close();
	conn.close();
	return;
}

	String sql = "insert into consumer values (null, ?, ?)";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, username);
	ps.setString(2, password);
	ps.executeUpdate();
	ps.close();
	conn.close();
	
	response.sendRedirect("registerSuccess.jsp");
	%>   
  </body>
</html>
