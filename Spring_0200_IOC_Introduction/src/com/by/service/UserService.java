package com.by.service;

import com.by.dao.UserDAO;
import com.by.model.User;

public class UserService {
	private UserDAO userDAO; // û��new,����������ɣ����Ʒ�תIOC��,����ʵ�֣���ͨ��������ת���ӿڣ�����ӿڱ�̣�

	public void add(User u) {
		userDAO.save(u);// ֱ�ӽӿڵ��÷��������ٳ�ʼ���������ʽȥ����
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	// UserDAO userDAO=new UserDAOImpl(); �Ժ�userDAO���õ���Ȼ��ʵ�� �˵Ľӿڷ���
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
