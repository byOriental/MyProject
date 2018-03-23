package com.by.service;

import org.junit.Test;

import com.by.model.User;
import com.by.spring.BeanFactory;
import com.by.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();

		UserService service = (UserService) applicationContext
				.getBean("userService"); // 去工厂拿对象（不同new）
		// UserDAO userDAO = (UserDAO) applicationContext.getBean("u");//
		// 相当于在userservice里面初始化new
		// service.setUserDAO(userDAO);
		User u = new User();
		service.add(u);
	}

}
