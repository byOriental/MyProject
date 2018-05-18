<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  </head>
  
  <body>
  	<%
  		String name=(String)application.getAttribute("name");
  		Date birthday=(Date)application.getAttribute("birthday");
  	 %>
  	 <h1>名字：<%=name %></h1>
  	 <h5>生日：<%=birthday %></h5>
  </body>
</html>
