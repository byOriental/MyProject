<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登陆页面</title>
  </head>
  
  <body>
  <!-- info消息显示 -->
  <%
  		List<String> info=(List<String>)request.getAttribute("info");
  		if(info!=null){
  		Iterator<String> it=info.iterator();
		while(it.hasNext()){  	
   %>
   			<h1><%=it.next() %></h1>
  <%
  		}
  	}
   %>
   <!-- javascript片段 -->
     <script language="Javascript">
  		function validate(f){
  			if(!(/^\w{5,15}$/.test(f.userid.value))){
  				alert("用户ID必须是5-15位");
  				f.userid.focus();
  				return false;
  			}
  			if(!(/^\w{5,15}$/.test(f.password.value))){
  				alert("用户密码必须是5-15位");
  				f.userid.focus();
  				return false;
  			}
  			return true;
  		}
  </script>
  <!-- 表单 -->
  <form action="LoginServlet" method="post" onSubmit="return validate(this)">
  		用户ID:<input type="text" name="userid"><br>
  		密&nbsp;&nbsp;码:<input type="password" name="password"><br>
  		<input type="submit" value="提交">
  		<input type="reset" value="重置">
  </form>
  </body>
</html>
