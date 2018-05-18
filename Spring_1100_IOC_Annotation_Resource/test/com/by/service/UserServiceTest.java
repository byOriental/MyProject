package com.by.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");

		UserService service = (UserService) ctx.getBean("userService");
		service.add(new User());
		System.out.println(service.getUserDAO());
		ctx.destroy();

	}

}
