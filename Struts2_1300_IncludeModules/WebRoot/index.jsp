<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
</head>
<body>
<form name="f" action="" method="post">
ำรปงร๛ฃบ<input type="text" name="name"/>
รÜย๋ฃบ<input type="text" name="password"/>
<br />
<input type="button" value="submit1" onclick="javascript:document.f.action='login/login1';document.f.submit();" />
<input type="button" value="submit2" onclick="javascript:document.f.action='login/login2';document.f.submit();" />
<input type="button" value="submit3" onclick="javascript:document.f.action='login/login3';document.f.submit();" />
<input type="button" value="submit4" onclick="javascript:document.f.action='login/login4';document.f.submit();" />
</form>
	
</body>
</html>
