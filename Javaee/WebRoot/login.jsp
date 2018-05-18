<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  <form action="login.jsp" method="post">
  	用户名：<input type="text" name="user">
  	密&nbsp;&nbsp;码：<input type="password" name="password">  
  	<input type="submit" value="提交">
  	<input type="reset" value="重置">
  </form>
  <%
  		String user=request.getParameter("user");
  		String password=request.getParameter("password");
  		if(!(user==null||"".equals(user)
  			||(password==null||"".equals(password)))){
  			if("shanghai".equals(user)&&"china".equals(password)){
  			response.setHeader("refresh", "4;url=welcome.jsp");
  			session.setAttribute("user", user);//不能保存在request域里面，因为客户端跳转后无法获取保存值
  %>
  			
  <%	
  		}else{
  %>
  					<h1>错误用户名和密码！</h1>
  <%
  			}
  		}
   %>		
  
  </body>
  
</html>
