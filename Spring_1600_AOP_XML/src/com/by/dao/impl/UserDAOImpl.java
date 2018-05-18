package com.by.dao.impl;

import org.springframework.stereotype.Component;

import com.by.dao.UserDAO;
import com.by.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {
	@Override
	public void save(User user) {
		System.out.println("user saved!");
	}
}