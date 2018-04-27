package com.by.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;

/**
 * 
 * @Title:CategoryServiceImpl
 * @Description:直接操作数据库
 * @author:Administrator
 * @date:2018年4月18日 上午12:22:29
 */

// （模块自身的业务逻辑）
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements
		CategoryService {
	/*
	 * 只需实现CategoryService接口中新增的方法即可，公共方法已经在BaseServiceImpl中实现了
	 */
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * left join表示关联Account一起查询，fetch表示将Account对象加到Category中去，
	 * 这样就只会发一条SQL语句了，并且返回的Category中也包含了Account对象了。
	 */
	public List<Category> queryJoinAccount(String type) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		// String hql = "from Category c where c.type like :type";//出现1+N问题
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%").list();
	}

}
