<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:useBean id="simple" scope="page" class="javaee.bean.SimpleBean"/><!-- 必须指定具体类 -->

<html>
  <head>
    <title>My JSP 'use_bean_demo02.jsp' starting page</title>
  </head>
  
  <body>	
  <%
  		simple.setName("chinese");
  		simple.setAge(2000);
   %>
   
   <h1>国家：<%=simple.getName() %></h1>
   <h2>历史：<%=simple.getAge() %></h2>
  </body>
</html>
