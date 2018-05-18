<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=GB18030" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();//输出“/Struts2_0400_Path”
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" /><!-- 此处声明根路径（http://localhost:8080/Struts2_0400_Path/）在以下超链接都自动被引用 -->
<title>Insert title here</title>
</head>
<body>
struts2中的路径问题是根据action的路径而不是jsp路径来确定，所以尽量不要使用相对路径。<br />
<a href="index.jsp">index.jsp</a><!-- 自动被引用：http://localhost:8080/Struts2_0400_Path/index.jsp -->
<br />
虽然可以用redirect方式解决，但redirect方式并非必要。
<br />
解决办法非常简单，统一使用绝对路径。（在jsp中用request.getContextRoot方式来拿到webapp的路径）
<br />
或者使用myeclipse经常用的，指定basePath,注：<base>标签：当前页面中所有连接都会在前面加上base地址。
</body>
</html>
