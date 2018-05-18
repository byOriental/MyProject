<%@page import="javax.sql.*"%>
<%@page import="java.sql.*"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
  <%
  		String DSNAME="java:comp/env/jdbc/baiyang";//JNDI名称
  		Context ctx=new InitialContext();  //初始化名称查找上下文
  		DataSource ds=(DataSource)ctx.lookup(DSNAME);//取得DataSource实例
  		Connection conn=ds.getConnection();//取得数据库衔接
  		
   %>
   <%=conn %>
   <%
   	conn.close();
    %>
  </body>
</html>
