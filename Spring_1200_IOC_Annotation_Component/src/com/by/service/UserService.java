package com.by.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:���-�����Զ�������ʵ����װ��Ϊ��ֵ��ʽ�Ķ��󲢳�ʼ��
 * @author:Administrator
 * @date:2018��3��22�� ����3:08:29
 */
@Component(value = "userService")
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

	@Resource(name = "userDao")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}