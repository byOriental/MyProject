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
				.getBean("userService"); // ȥ�����ö��󣨲�ͬnew��
		// UserDAO userDAO = (UserDAO) applicationContext.getBean("u");//
		// �൱����userservice�����ʼ��new
		// service.setUserDAO(userDAO);
		User u = new User();
		service.add(u);
	}

}
