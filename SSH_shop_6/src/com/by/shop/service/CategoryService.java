package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Category;

public interface CategoryService extends BaseService<Category> {
	/*
	 * 只要添加CategoryService本身需要的新的方法即可，公共方法已经在BaseService中了
	 */
	// 查询类别信息，级联管理员
	public List<Category> queryJoinAccount(String type); // 使用类别的名称查询

}
