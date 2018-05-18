package com.by.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		// ��ȡ���������ļ�����Ķ���
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) ctx.getBean("userService");
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u); // ����add�ĵ��á�����������ע���DAO�ŵ��Ե��ã�����������ע��Ķ��󣩣���ͬ��ʵ�֣�ע�벻һ������
	}

}
