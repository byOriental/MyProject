package com.by.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");// ³õÊ¼»¯ÈÝÆ÷

		UserService service = (UserService) ctx.getBean("userService");

		System.out.println(service.getUserDAO());

	}

}
