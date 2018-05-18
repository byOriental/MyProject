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
		<li>访问值栈中的action的普通属性: username = <s:property value="username"/> </li>
		<li>访问值栈中对象的普通属性(get set方法)：<s:property value="user.age"/> | <s:property value="user['age']"/> | <s:property value="user[\"age\"]"/> | wrong: <%--<s:property value="user[age]"/>--%></li>
		<li>访问值栈中对象的普通属性(get set方法): <s:property value="cat.friend.name"/></li>
		<li>访问值栈中对象的普通方法：<s:property value="password.length()"/></li>
		<!-- 只有动态指定（new对象）,miaomiao()才被调用 -->
		<li>访问值栈中对象的普通方法：<s:property value="cat.miaomiao()" /></li>
		<li>访问值栈中action的普通方法：<s:property value="m()" /></li>
		<hr />
		<li>访问静态方法：<s:property value="@sh.pd.struts2.user.action.S@s()"/></li><!-- 固定写法 -->
		<li>访问静态属性：<s:property value="@sh.pd.struts2.user.action.S@STR"/></li>
		<li>访问Math类的静态方法：<s:property value="@@max(2,3)" /></li><!-- 固定写法 -->
		<hr />
		<li>访问普通类的构造方法（对象）：<s:property value="new sh.pd.struts2.user.action.User(7)"/></li>
		<hr />
		<li>访问List:<s:property value="users"/></li>
		<li>访问List中某个元素:<s:property value="users[1]"/></li>
		<li>访问List中元素某个属性的集合:<s:property value="users.{age}"/></li><!-- 返回年龄的集合 -->
		<li>访问List中元素某个属性的集合中的特定值:<s:property value="users.{age}[0]"/> | <s:property value="users[0].age"/></li><!-- 推荐写法 -->
		<li>访问Set(对象打印):<s:property value="dogs"/></li>
		<li>访问Set中某个元素:<s:property value="dogs[1]"/></li><!-- set无序，无法指定具体元素 -->
		<li>访问Map:<s:property value="dogMap"/></li><!-- {dog100=dog: dog100, dog101=dog: dog101, dog102=dog: dog102} -->
		<li>访问Map中某个元素:<s:property value="dogMap.dog101"/><!-- 推荐写法 --> | <s:property value="dogMap['dog101']"/> | <s:property value="dogMap[\"dog101\"]"/></li>
		<li>访问Map中所有的key:<s:property value="dogMap.keys"/></li>
		<li>访问Map中所有的value:<s:property value="dogMap.values"/></li>
		<li>访问容器的大小：<s:property value="dogMap.size()"/> | <s:property value="users.size"/> </li>
		<hr /><!-- OGNL表达式中，value包含中括号的通常是集合 -->
		<li>投影(过滤)：<s:property value="users.{?#this.age==1}[0]"/></li><!-- 遍历users（this表示遍历到当前时的对象）age等于1的集合，再显示第一个user对象 -->
		<li>投影：<s:property value="users.{^#this.age>1}.{age}"/></li><!-- age大于1的集合（[user2,user3]）,它的开头（^）元素age是多少[2] -->
		<li>投影：<s:property value="users.{$#this.age>1}.{age}"/></li><!-- age大于1的集合（[user2,user3]）,它的末尾（$）元素age是多少[3] -->
		<li>投影：<s:property value="users.{$#this.age>1}.{age} == null"/></li>
		<hr />
		<li>[]:<s:property value="[0].username"/></li><!-- value="[0]"时显示的是stack value的所有action集合（访问观察：http://localhost:8080/Struts2_1900_OGNL/test.action?username=baiyang） -->
		<!-- 显式注释 -->
		<%-- 隐式注释 --%>
		
	</ol>
	
	<s:debug></s:debug>
</body>
</html>
