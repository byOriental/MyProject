package com.by.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserService
 * @Description:组件-容器自动将本地实体类装配为键值形式的对象并初始化
 * @author:Administrator
 * @date:2018年3月22日 下午3:08:29
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