package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Category;
//此类为自己业务新添新功能
//CategoryService接口  

public interface CategoryService extends BaseService<Category> {
	// 查询类别信息，级联管理员
	public List<Category> queryJoinAccount(String type, int page, int size); // 使用类别的名称查询
	// 根据关键字查询总记录数

	public Long getCount(String type);

	public void deleteByIds(String ids);
}
