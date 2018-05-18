package com.by.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:通过注解设置注入方式——自动注入
 * @author:Administrator
 * @date:2018年3月22日 下午3:08:29
 */
public class UserService {

	private UserDAO userDAO;

	public void init() {
		System.out.println("init");
	}

	public void add(User user) {
		userDAO.save(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	// 自动注入-默认bytype装配
	@Autowired
	public void setUserDAO(@Qualifier("u") UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}