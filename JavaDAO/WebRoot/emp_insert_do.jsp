<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="pd.vo.BaseInfo.*,pd.factory.DaoFactory.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>员工信息插入</title>
  </head>
  <%request.setCharacterEncoding("utf-8"); %>
  <body>
  <!-- 将信息插入到员工里面去 -->
  <%
  		Emp emp=new Emp();
  		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
  		emp.setEname(request.getParameter("ename"));
  		emp.setJob(request.getParameter("job"));
  		emp.setHiredate(new SimpleDateFormat("yy-MM-dd")
  			.parse(request.getParameter("hiredate")));
  		emp.setSal(Float.parseFloat(request.getParameter("sal")));
  	try{
  			if(DaoFactory.getEmpDaoInstance().doCreate(emp)){
   %>
   			<h2>添加成功！！！</h2>
   <%
   }else{
    %>
    		<h2>添加失败！！！</h2>
   <%
  		 }
  	}catch(Exception e){
  	   e.printStackTrace();
  }
    %>
  </body>
</html>
