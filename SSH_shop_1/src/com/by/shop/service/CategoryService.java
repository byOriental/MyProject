package com.by.shop.service;

import com.by.shop.model.Category;

public interface CategoryService {
	public void save(Category category); // 用来测试Hibernate环境

	public void update(Category category); // 用来测试Spring和Hibernate整合后

}
