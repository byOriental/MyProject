<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
  </head>
  
  <body>
  <!-- 迭代consumers集合出来 -->
    <s:iterator value="consumers">
   		<s:property value="username"/>
    </s:iterator>
    <s:debug></s:debug>
  </body>
</html>
