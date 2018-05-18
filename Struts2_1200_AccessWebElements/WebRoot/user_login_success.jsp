<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
</head>
<body>
	User Login Success!
	<br />
	<!-- 两种方式提取数据 -->
	
	<s:property value="#request.ws"/> | <%=request.getAttribute("ws") %> <br />
	<s:property value="#session.lcc"/> | <%=session.getAttribute("lcc") %> <br />
	<s:property value="#application.szh"/> | <%=application.getAttribute("szh") %> <br />
	<s:property value="#attr.ws"/><br />
	<s:property value="#attr.lcc"/><br />
	<s:property value="#attr.szh"/><br />
	<s:debug></s:debug>
	<br />
</body>
</html>
