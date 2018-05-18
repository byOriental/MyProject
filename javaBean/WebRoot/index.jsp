<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册表单</title>
  </head>
 <jsp:useBean id="reg" scope="request" class="use.rgist.ck.Register"/>
  <body>
  <form action="check.jsp" method="post">
  用户名:<input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>">
  	<%=reg.getErrorMsg("errname") %><br>
 年&nbsp;&nbsp;龄:<input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>">
  	<%=reg.getErrorMsg("errage") %><br>
  邮&nbsp;&nbsp;箱:<input type="text" name="email" value="<jsp:getProperty name="reg" property="email"/>">
  	<%=reg.getErrorMsg("errmail") %><br>
 <input type="submit" value="注册"><input type="reset" value="重置"> 		
 
  </form>
  </body>
</html>
