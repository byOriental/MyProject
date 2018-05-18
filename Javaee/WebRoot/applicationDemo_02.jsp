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
  		Enumeration e=this.getServletContext().getAttributeNames();
  		while(e.hasMoreElements()){
  		String name=(String)e.nextElement();
  		
   %><!-- 从输出中可以看到满屏 的内容，即容器的内容都被包含在application中，application就是代表容器 -->
   <h1><%=name %>--><%=this.getServletContext().getAttribute(name)%></h1>
   <%
   }
    %>
  
  </body>
</html>
