package com.by.dao;

import com.by.model.User;

/**
 * 
 * @Title:UserDAO
 * @Description:���������ί���ࣩ
 * @author:Administrator
 * @date:2018��3��23�� ����10:16:38
 */
public interface UserDAO {
	public void save(User user);

	public void delete();
}
