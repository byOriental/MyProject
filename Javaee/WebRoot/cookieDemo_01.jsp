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
  		Cookie c1=new Cookie("city","shanghai");
  		Cookie c2=new Cookie("country","china");
  		response.addCookie(c1);
  		response.addCookie(c2);
  		response.sendRedirect("cookieDemo_02.jsp");//没有设置保存时间，当重新打开浏览器时出现空指针异常
  	 %>
  	 
  </body>
</html>
