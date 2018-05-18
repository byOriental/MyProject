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
  		c1.setMaxAge(60);//设置保存时间60秒。此时重新打开浏览器就不会出现空指针异常了
  		c2.setMaxAge(60);
  		response.addCookie(c1);//将其保存在浏览器上
  		response.addCookie(c2);
  		response.sendRedirect("cookieDemo_02.jsp");
  	 %>
  	 
  </body>
</html>
