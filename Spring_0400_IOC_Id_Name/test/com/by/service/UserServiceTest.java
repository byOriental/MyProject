package com.by.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		// 获取容器配置文件里面的对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService) ctx.getBean("userService");
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u); // 方法add的调用、依赖于容器注入给DAO才得以调用（依赖于容器注入的对象），不同的实现，注入不一样（灵活）
	}

}
