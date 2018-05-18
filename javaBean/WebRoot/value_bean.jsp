<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
    <title>My JSP 'use_bean_demo02.jsp' starting page</title>
  </head>
  <%int age=28; %>
  <jsp:useBean id="simple" scope="page" class="javaee.bean.SimpleBean"/>
  <jsp:setProperty name="simple" property="name" value="北京"/><!-- 指定属性设置到SimpleBean中-->
  <jsp:setProperty name="simple" property="age" value="<%=age %>"/>
  <body>	
  <h1>name:<%=simple.getName() %></h1>
  <h2>age:<%=simple.getAge() %></h2>
  </body>
</html>