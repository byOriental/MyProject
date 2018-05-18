<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<% String context = request.getContextPath(); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
  
<body>
Action执行的时候并不一定要执行execute方法<br />
可以在配置文件中配置Action的时候用method=来指定执行哪个方法
也可以在url地址中动态指定（动态方法调用DMI）（推荐）<br />
	<a href="<%=context %>/user/userAdd">添加用户</a>
	<br />
	<a href="<%=context %>/user/user!add">添加用户</a>
	<br />
前者会产生太多的action，所以不推荐使用
	
</body>
</html>
