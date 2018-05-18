package com.by.service;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:依赖注入-set方法（重要）、构造方法注入（了解）
 * @author:Administrator
 * @date:2018年3月20日 下午5:10:55
 */
public class UserService {
	private UserDAO userDAO; // 没有new,在容器中完成（控制反转IOC）,并由实现（普通操作）反转到接口（面向接口编程）

	// Constructor注入
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void add(User u) {
		userDAO.save(u);// 直接接口调用方法，不再初始化子类对象方式去调用
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	// set注入——UserDAO userDAO=new userDAOImpl(); 以后userDAO调用的自然是实现 了的接口方法
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
