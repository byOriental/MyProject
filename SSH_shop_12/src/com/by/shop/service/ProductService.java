package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Product;

//ProductService接口继承BaseService<Product>  
public interface ProductService extends BaseService<Product> {
	// 查询商品信息，级联类别
	public List<Product> queryJoinCategory(String type, int page, int size); // 使用商品的名称查询
	// 根据关键字查询总记录数

	public Long getCount(String type);
}