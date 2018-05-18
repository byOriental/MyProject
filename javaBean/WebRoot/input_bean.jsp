<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
    <title>My JSP 'use_bean_demo02.jsp' starting page</title>
  </head>
  <jsp:useBean id="info" scope="page" class="javaee.bean.SimpleBean"/>
  <jsp:setProperty  name="info" property="*"/><!-- 自动将input_bean.html的属性设置到SimpleBean中-->

  <body>	
  <h1>name:<%=info.getName() %></h1>
  <h2>age:<%=info.getAge() %></h2>
  
  <h1>name:<jsp:getProperty name="info" property="name"/></h1>
  <h1>age:<jsp:getProperty name="info" property="age"/></h1>
  </body>
</html>
