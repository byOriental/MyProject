<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'get_info.jsp' starting page</title>
  </head>
  <body>
   <h1>城市：<%=session.getAttribute("school") %></h1>
   <h2>大城市：<%=request.getAttribute("course") %></h2>
  </body>
</html>
