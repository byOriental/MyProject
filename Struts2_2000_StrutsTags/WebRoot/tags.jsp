<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
</head>
<body>
	<ol>
		<li>property: <s:property value="username"/> </li>
		<li>property 取值为字符串: <s:property value="'username'"/> </li><!-- 显示字符串 -->
		<li>property 设定默认值: <s:property value="admin" default="管理员"/> </li>
		<li>property 设定HTML: <s:property value="'<hr/>'" escape="false"/> </li><!-- 默认是true -->
		<hr />
		<li>set 设定adminName值（默认为request 和 ActionContext）: <s:set var="adminName" value="username" /></li>
		<li>取出来：property: <s:property value="adminName"/> </li>
		<li>set 从request取值: <s:property value="#request.adminName" /></li>
		<li>set 从ActionContext取值: <s:property value="#adminName" /></li>
		<%--<li>set 设定范围: <s:set name="adminPassword" value="password" scope="page"/></li>
		<li>set 从相应范围取值: <%=pageContext.getAttribute("adminPassword") %></li>
		--%>
		<li>set 设定var，范围为ActionContext(value context): <s:set var="adminPassword" value="password" scope="session"/></li>
		<li>set 使用#取值: <s:property value="adminPassword"/> </li>
		<li>set 从相应范围取值: <s:property value="#session.adminPassword"/> </li>
		
		<hr />
		
		<%--<li>push:<s:set name="myDog" value="new com.bjsxt.struts2.ognl.Dog('oudy')"></s:set></li>
		<li>
		push:<s:push value="#myDog">
			<s:property value="name"/>
		</s:push>
		</li>
		<li>push: <s:property value="name"/></li>
		--%>
		
		<hr />
		<li>bean 定义bean,并使用param来设定新的属性值（属性赋值）:
			<s:bean name="sh.pd.struts2.user.tags.Dog" >
				<s:param name="name" value="'pp'"></s:param>
				<s:property value="name"/>
				<!--没有var的bean设置当执行结束时就被弹出value stack,其他位置不能访问到-->
			</s:bean>
			
			
		</li>
		
		<li>bean 查看debug情况:
			<s:bean name="sh.pd.struts2.user.tags.Dog" var="myDog">
				<s:param name="name" value="'oudy'"></s:param><!-- 这里赋值是OGNL表达式value不能直接使用字符串 -->
			</s:bean>
			<!--有var的bean设置当执行时就被压到stack context,并打印对应的对象值（value），其他位置能访问到 -->
			bean外拿出值：
			<s:property value="#myDog.name"/>
		</li>
  		
		<hr />
		
		<li>include _include1.html 包含静态英文文件
		<s:include value="/_include1.html"></s:include>
		</li>
		
		<li>include _include2.html 包含静态中文文件
		<s:include value="/_include2.html"></s:include><!-- 中文乱码问题无法处理 -->
		</li>
		
		<li>include _include1.html 包含静态英文文件，说明%用法
		<s:set var="incPage" value="%{'/_include1.html'}" /><!-- 默认下是ognl表达式，添加百分号大括号在不是ognl情况下强制转换 -->
		<s:include value="%{#incPage}"></s:include><!-- 百分号大括号强制将#incPage内容不要当字符串，而是ognl表达式 -->
		</li>
		
		
		<hr />
		<!-- http://localhost:8080/Struts2_2000_StrutsTags/tags.action?username=u&password=p&age=12&age=19 (这里传进去的age是一个集合)-->
		<li>if elseif else: 
		age = <s:property value="#parameters.age" /> <br /><!-- 显示集合 -->
		<s:set var="age" value="#parameters.age[0]" /><!-- var=age相当于集合变量，方便提取 （普通变量存放在stack value）-->
		<s:if test="#age < 0">wrong age!</s:if>
		<s:elseif test="#parameters.age[0] < 20">too young!</s:elseif>
		<s:else>yeah!</s:else><br />
		<s:if test="#parameters.aaa == null">null</s:if>
		</li>
		
		<hr />
		
		<li>遍历集合(推荐使用)：<br />
		<!--<s:iterator value="{1, 2, 3} "  >
			<s:property/> |
		</s:iterator>另一种方法 -->
		<s:iterator value="{1, 2, 3} " var="num" >
			<s:property value="#num"/> |
		</s:iterator>
		
		</li>
		<li>自定义变量(字符串集合)：<br />
		<s:iterator value="{'aaa', 'bbb', 'ccc'}" var="x">
			<s:property value="#x.toUpperCase()"/> |
		</s:iterator>
		<s:debug></s:debug>
		</li>
		<li>使用status:<br />
		<s:iterator value="{'aaa', 'bbb', 'ccc'}" status="status">
			<s:property/> | 
			遍历过的元素总数：<s:property value="#status.count"/> |
			遍历过的元素索引：<s:property value="#status.index"/> |
			当前是偶数？：<s:property value="#status.even"/> |
			当前是奇数？：<s:property value="#status.odd"/> |
			是第一个元素吗？：<s:property value="#status.first"/> |
			是最后一个元素吗？：<s:property value="#status.last"/>
			<br />
		</s:iterator>
		
		</li>
		
		<li>遍历（#（x:'y',m:'n'））相当于map集合
		<s:iterator value="#{1:'a', 2:'b', 3:'c'}" >
			<s:property value="key"/> | <s:property value="value"/> <br />
		</s:iterator>
		</li>
		
		<li>
		<s:iterator value="#{1:'a', 2:'b', 3:'c'}" var="x"><!-- var表示一个子项 -->
			<s:property value="#x.key"/> | <s:property value="#x.value"/> <br />
		</s:iterator>
		</li>
		
		<li>
		
		<s:fielderror fieldName="fielderror.test" theme="simple"></s:fielderror>
		
		</li>
	</ol>
	
	
	
	
</body>
</html>
