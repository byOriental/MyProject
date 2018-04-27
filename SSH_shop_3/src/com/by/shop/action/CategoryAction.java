package com.by.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.model.Category;

/**
 * 
 * @Title:CategoryAction
 * @Description:��Ӳ������ݿ�
 * @author:Administrator
 * @date:2018��4��18�� ����12:22:46
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

	// ����ȡ�����ݷŵ���������棬�������תҳ���ȡ�����µ��򶼿��Ի�ȡ
	public String query() {
		request.put("categoryList", categoryService.query());
		session.put("categoryList", categoryService.query());
		application.put("categoryList", categoryService.query());
		// categoryService.query();
		return "index";
	}

}