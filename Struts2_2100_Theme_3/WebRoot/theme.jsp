<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
<title>theme学习</title>


</head>
<body>
在struts.xml中控制theme，默认为xhtml，可以设置为：simple/css_html/ajax
	<ol>
		<li>
		<s:form >
		<div class="formFieldError">
		<s:fielderror />
		</div>
		<s:textfield name='aaa'></s:textfield>
		</s:form>
		</li>
	</ol>
</body>
</html>
