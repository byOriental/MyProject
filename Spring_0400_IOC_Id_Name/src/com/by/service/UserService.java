package com.by.service;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:����ע��-set��������Ҫ�������췽��ע�루�˽⣩
 * @author:Administrator
 * @date:2018��3��20�� ����5:10:55
 */
public class UserService {
	private UserDAO userDAO; // û��new,����������ɣ����Ʒ�תIOC��,����ʵ�֣���ͨ��������ת���ӿڣ�����ӿڱ�̣�

	// Constructorע��
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u) {
		userDAO.save(u);// ֱ�ӽӿڵ��÷��������ٳ�ʼ���������ʽȥ����
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	// setע�롪��UserDAO userDAO=new userDAOImpl(); �Ժ�userDAO���õ���Ȼ��ʵ�� �˵Ľӿڷ���
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
