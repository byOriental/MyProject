package com.by.service;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:�û�����-�û������ɼ������γ̹�����beans.xml������������Щ����й���
 * @author:Administrator
 * @date:2018��3��22�� ����11:16:15
 */
public class UserService {
	private UserDAO userDAO; // ���������&&���Ʒ�ת-����������ʼ��

	// �����Ѿ�ʵ�ֵķ���
	public void add(User u) {
		userDAO.save(u);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
