package com.by.dao.impl;

import com.by.aop.LogInterceptor;
import com.by.dao.UserDAO;
import com.by.model.User;

public class UserDAOImpl3 implements UserDAO {

	private UserDAO userDAO = new UserDAOImpl();

	public void save(User user) {

		new LogInterceptor().beforeMethod(null);
		userDAO.save(user);

	}

	public void delete() {
		// TODO Auto-generated method stub

	}
}
