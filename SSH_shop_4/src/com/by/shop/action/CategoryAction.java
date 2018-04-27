package com.by.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.model.Category;

/**
 * 
 * @Title:CategoryAction
 * @Description:间接操作数据库
 * @author:Administrator
 * @date:2018年4月18日 上午12:22:46
 */
@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

	public String update() {
		System.out.println("----update----");
		categoryService.update(model);
		return "index";
	}

	public String save() {
		System.out.println("----save----");
		categoryService.save(model);
		return "index";
	}

	// 不能执行
	public String query() {
		request.put("categoryList", categoryService.query());
		session.put("categoryList", categoryService.query());
		application.put("categoryList", categoryService.query());
		categoryService.query();
		return "index";
	}

}