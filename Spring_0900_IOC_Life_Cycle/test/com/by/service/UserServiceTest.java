package com.by.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		//初始化容器
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext接口没有init()/destroy()方法,需要用普通类进行new
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans.xml");// 初始化容器
		UserService service = (UserService) ctx1.getBean("userService");
		ctx1.destroy();
		

	}	

}
