<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  

  </head>
  
  <body>
  <!-- 将文件进行保存到指定文件夹 -->
  <%
  		response.setCharacterEncoding("utf-8");
  		String name=request.getParameter("filename");
  		String content=request.getParameter("filecontent");
  		String filename=this.getServletContext().getRealPath("/")+"note"+File.separator+name;
  		File file=new File(filename);
  		if(!file.getParentFile().exists()){  //判断父文件夹是否存在，创建文件夹
  			file.getParentFile().mkdir();
  		}
  		PrintStream prt=null;
  		prt=new PrintStream(new FileOutputStream(file));//指定打印流
  		prt.println(content);//指定输出内容，此时在文件夹“C:\Tomcat7.0\me-webapps\Javaee\note”可以看到所定义的文件
  		prt.close(); 
   %>
   <!-- 将文件进行输出 -->
   <%
   		Scanner sc=new Scanner(new FileInputStream(file));  
   		sc.useDelimiter("\n");  //分隔符为换行
   		StringBuffer strbf=new StringBuffer();
   		while(sc.hasNext()){
   			strbf.append(sc.next()).append("<br>");
   		}
   		sc.close();
    %>
  <h1><%=strbf %></h1>
  </body>
</html>
