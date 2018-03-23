package com.by.dao.impl;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserDAOImpl
 * @Description:代理对象
 * @author:Administrator
 * @date:2018年3月23日 上午10:16:14
 */
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
	}

	public void delete() {
		System.out.println("user deteleted");

	}

}
