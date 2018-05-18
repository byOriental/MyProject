<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
</head>
<body>
	User Login Success!
	<br />
	<s:property value="#request.r1"/> | <%=request.getAttribute("r1") %> <br />
	<s:property value="#session.s1"/> | <%=session.getAttribute("s1") %> <br />
	<s:property value="#application.a1"/> | <%=application.getAttribute("a1") %> <br />
</body>
</html>
