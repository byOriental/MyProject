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
  		pageContext.setAttribute("name", "北京");
  		pageContext.setAttribute("age", 18);
  	 %>
  	 <!-- 无法获取pagecontext设置的属性值 -->
  	 <jsp:forward page="page_scope_03.jsp"/>
  </body>
</html>
