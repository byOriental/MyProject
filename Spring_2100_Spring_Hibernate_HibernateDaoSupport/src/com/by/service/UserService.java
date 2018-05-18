package com.by.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.by.dao.LogDAO;
import com.by.dao.UserDAO;
import com.by.model.ByLog;
import com.by.model.User;

@Component("userService")
public class UserService {

	private UserDAO userDAO;
	private LogDAO logDAO;

	public void init() {
		System.out.println("init");
	}

	public User getUser(int id) {
		return null;
	}

	// 自动在注解方法的前后加入业务逻辑
	// 默认runtime异常，自动回滚
	// 默认为REQUIRED,方法add如果调用者有Transaction，则不需要再创建，否则需要创建
	// @Transactional(propagation = Propagation.REQUIRED)
	public void add(User user) {

		userDAO.save(user);
		ByLog log = new ByLog();
		log.setMsg("a user saved!");
		logDAO.save(log);

	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource(name = "u")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public LogDAO getLogDAO() {
		return logDAO;
	}

	@Resource
	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
