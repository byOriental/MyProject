package com.by.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");

		UserService service = (UserService) ctx.getBean("userService");
		System.out.println(service.getClass());
		service.add(new User());

		ctx.destroy();

	}

}
