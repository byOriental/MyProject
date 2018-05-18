<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
</head>
<body>
	User Add Error!
	<s:fielderror fieldName="name" /><!-- 显示全部错误信息 -->
	<br />
	<s:property value="errors.name[0]"/><!-- 显示第一条错误信息 （OGNL表达式）-->
	<s:debug></s:debug>
</body>
</html>
