package com.by.dao.impl;

import com.by.dao.UserDAO;
import com.by.model.User;

public class UserDAOImpl implements UserDAO {
	// �����Գ�ʼ��
	private int daoId;
	private String daoStatus;

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public String getDaoStatus() {
		return daoStatus;
	}

	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}

	public void save(User user) {
		System.out.println("user saved!!");
	}

}
