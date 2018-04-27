package com.by.shop.service.impl;

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
}
