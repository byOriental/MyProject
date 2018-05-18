<%@page import="pd.factory.DaoFactory.*,pd.vo.BaseInfo.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查询操作</title>
  </head>
  
  <body>
  <!-- 表单处理 -->
  <%
  		String keyWord=request.getParameter("kw");
  		if(keyWord==null){
  			keyWord="";
  	 }
  	 List<Emp> all=DaoFactory.getEmpDaoInstance().findAll(keyWord);
  	 Iterator<Emp> iter=all.iterator();
   %>
   
  <!-- 表单 -->
  <center>
  <form action="emp_list.jsp" method="post">
  <h2>请输入关键字:</h2><input type="text" name="kw">
  	  <input type="submit" name="查询">
  </form>
  
  <!-- 表格显示 -->
  <table border="1" width="80%">
  <tr>
  		<td>员工编号</td>
  		<td>员工姓名</td>
  		<td>员工职位</td>
  		<td>雇佣日期</td>
  		<td>员工工资</td>
  </tr>
  <%
  		while(iter.hasNext()){
  		Emp emp=iter.next();
   %>
   <tr>
   		<td><%=emp.getEmpno() %></td>
   		<td><%=emp.getEname() %></td>
   		<td><%=emp.getJob() %></td>
   		<td><%=emp.getHiredate() %></td>
   		<td><%=emp.getSal() %></td>
   </tr>
   <%
   	}
    %>
    </table>
    </center>
  </body>
</html>
