package com.by.shop.action;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title:CategoryAction
 * @Description:间接操作数据库
 * @author:Administrator
 * @date:2018年4月18日 上午12:22:46
 */
public class CategoryAction extends ActionSupport {

	private Category category;// 设置一个私有成员变量接收url带过来的参数，注意下面要写好get和set方法

	private CategoryService categoryService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public String update() {
		System.out.println("----update----");
		System.out.println(categoryService);// 由于已经和Spring整合，所以可以拿到这个categoryService了，打印出来就不是null了
		categoryService.update(category); // 新加一条语句，来更新数据库
		return "index";
	}

	public String save() {
		System.out.println("----save----");
		System.out.println(categoryService);
		return "index";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
