<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册成功！</title>
  </head>
<jsp:useBean id="reg" scope="request" class=use.rgist.ck.Register></jsp:useBean>
  <body>
  用户名:<jsp:getProperty property="name" name="reg"/>
  年&nbsp;&nbsp;龄:<jsp:getProperty property="age" name="reg"/>
  邮&nbsp;&nbsp;箱:<jsp:getProperty property="email" name="reg"/>
  
  </body>
</html>
