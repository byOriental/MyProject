package com.by.dao.impl;

import org.springframework.stereotype.Component;

import com.by.dao.UserDAO;
import com.by.model.User;

@Component("u")
public class UserDAOImpl extends SuperDAO implements UserDAO {

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

}