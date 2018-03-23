package com.by.service;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:用户管理-用户管理、成绩管理、课程管理……beans.xml产生，它对这些类进行管理
 * @author:Administrator
 * @date:2018年3月22日 上午11:16:15
 */
public class UserService {
	private UserDAO userDAO; // 面向抽象编程&&控制反转-由容器来初始化

	// 调用已经实现的方法
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
