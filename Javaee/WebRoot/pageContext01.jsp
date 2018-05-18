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
  		pageContext.setAttribute("name", "shenzheng", PageContext.REQUEST_SCOPE);//可以单独设置域
  		pageContext.setAttribute("birthday", new Date(), PageContext.REQUEST_SCOPE);
  	 %>
  	 <jsp:forward page="pageContext02.jsp"/>
  </body>
</html>
