package com.by.dao.impl;

import com.by.dao.UserDAO;
import com.by.model.User;

/**
 * 
 * @Title:UserDAOImpl
 * @Description:�������
 * @author:Administrator
 * @date:2018��3��23�� ����10:16:14
 */
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
	}

	public void delete() {
		System.out.println("user deteleted");

	}

}
