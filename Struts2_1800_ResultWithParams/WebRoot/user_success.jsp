<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
</head>
<body>
	User Success!<br>
<!--服务器跳转共享value stack；redirect客户端跳转属于两次request，所以值栈取不到值，只有一次request的服务器端跳转才取得到  -->
	from valuestack: <s:property value="t"/><br/> 
	from actioncontext: <s:property value="#parameters.t"/>
	<s:debug></s:debug>
	<!-- 注：<s:property value="t"/>取不到值，因为jsp不是一个Action没有值堆栈。
<s:property value="#parameters.t"/>可以取出t的值，因为#方式是从ActionContext中取属性值。
	ActionContext堆栈中具有parameters这个属性是用于存储传入的参数。所以可以取出。 -->
	
</body>
</html>
