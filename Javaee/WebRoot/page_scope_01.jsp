<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<title>page</title>
  </head>
  
  <body>
 	<%
 		pageContext.setAttribute("name", "�Ϻ�");
 		pageContext.setAttribute("birthday", new Date());
 	 %>
 	<%
 	 	String name=(String)pageContext.getAttribute("name");
 	 	Date birthday=(Date)pageContext.getAttribute("birthday");
 	 %>
 	 <h1>������<%=name %></h1>
 	 <h1>������<%=birthday %></h1>
  </body>
</html>
