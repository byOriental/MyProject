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
  			Cookie c[]=request.getCookies();
  			for(int i=0;i<c.length;i++){
  		 %>
  		 <h2><%=c[i].getName() %>---><%=c[i].getValue() %></h2>   <!-- 单独使用<hn>会自动换行 -->
  		 <%
  		 	}
  		  %>
  </body>
</html>
