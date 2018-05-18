<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>信息验证</title>
    
  </head>
<jsp:useBean id="reg" scope="request" class="use.rgist.ck.Register"/>

  <body>
  <%
  if(reg.isValidate()){
  %>
  	<jsp:forward page="success.jsp"></jsp:forward>
  <%
  }else{
   %>
    <jsp:forward page="index.jsp"></jsp:forward>
  <%
  }
   %>
  </body>
</html>
