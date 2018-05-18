<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="simp.bn.*" %>
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
  		SimpleBean bean=new SimpleBean();
  		bean.setName("beijing");
  		bean.setAge(100);
   %>
   <h1>名称：<%=bean.getName() %></h1></br>
   <h1>时间：<%=bean.getAge() %></h1>
  </body>
</html>
