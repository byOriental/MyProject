package com.by.service;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.aop.LogInterceptor;
import com.by.dao.UserDAO;
import com.by.dao.impl.UserDAOImpl;
import com.by.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();

		UserService service = (UserService) applicationContext
				.getBean("userService");

		User u = new User();
		service.add(u);
	}

	@Test
	public void testProxy() {
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO
				.getClass().getClassLoader(), userDAO.getClass()
				.getInterfaces(), li);
		System.out.println(userDAOProxy.getClass());
		userDAOProxy.delete();
		userDAOProxy.save(new User());

	}

	/*
	 * class $Proxy4 implements UserDAO { save(User u) { Method m =
	 * UserDAO.getclass.getmethod li.invoke(this, m, u) } }
	 */

}
