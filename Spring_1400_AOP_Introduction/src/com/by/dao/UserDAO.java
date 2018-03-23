package com.by.dao;

import com.by.model.User;

/**
 * 
 * @Title:UserDAO
 * @Description:被代理对象（委托类）
 * @author:Administrator
 * @date:2018年3月23日 上午10:16:38
 */
public interface UserDAO {
	public void save(User user);

	public void delete();
}
