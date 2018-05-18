<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
  <head><title>员工信息插入</title>  </head>
<%request.setCharacterEncoding("utf-8");  %>
  <body>
  <form action="emp_insert_do.jsp" method="post">
  		员工编号:<input type="text" name="empno"><br>
  		员工姓名:<input type="text" name="ename"><br>
  		员工职位:<input type="text" name="job"><br>
  		雇佣日期:<input type="text" name="hiredate"><br>
  		基本工资:<input type="text" name="sal"><br>
  		<input type="submit" value="提交"> 
  		<input type="reset" value="重置">
  </form>	
  </body>
</html>
