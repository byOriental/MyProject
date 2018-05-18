<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  	<%
  		request.setCharacterEncoding("GBK");
  		String id=request.getParameter("id");
  		String name=request.getParameter("uname");
  		String inst[]=request.getParameterValues("inst");
  	 %>
  	 <h3>编号：<%=id %></h3>
  	 <h3>姓名：<%=name %></h3>
  	 <%
  	 	if(inst!=null){
  	  %>
  	 <h3>兴趣：
  	 <%
  	 		for(int i = 0;i<inst.length;i++){
  	 		
  	  %>
  	  			<%=inst[i] %>、
  	  <%
  	  }
  	   %>
  	   <%
  	   }
  	    %>
  	  </h3>
  </body>
</html>
