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
  	�û�����<input type="text" name="user">
  	��&nbsp;&nbsp;�룺<input type="password" name="password">  
  	<input type="submit" value="�ύ">
  	<input type="reset" value="����">
  </form>
  <%
  		String user=request.getParameter("user");
  		String password=request.getParameter("password");
  		if(!(user==null||"".equals(user)
  			||(password==null||"".equals(password)))){
  			if("shanghai".equals(user)&&"china".equals(password)){
  			response.setHeader("refresh", "4;url=welcome.jsp");
  			session.setAttribute("user", user);//���ܱ�����request�����棬��Ϊ�ͻ�����ת���޷���ȡ����ֵ
  %>
  			
  <%	
  		}else{
  %>
  					<h1>�����û��������룡</h1>
  <%
  			}
  		}
   %>		
  
  </body>
  
</html>
