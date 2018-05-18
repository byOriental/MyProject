package com.by.dao.impl;

import com.by.dao.UserDAO;
import com.by.model.User;

public class UserDAOImpl implements UserDAO {

	private int daoId;

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public void save(User user) {
		System.out.println("user saved!");
	}

	@Override
	public String toString() {
		return "daoId=" + daoId;
	}

}
