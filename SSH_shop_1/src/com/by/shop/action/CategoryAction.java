package com.by.shop.action;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title:CategoryAction
 * @Description:��Ӳ������ݿ�
 * @author:Administrator
 * @date:2018��4��18�� ����12:22:46
 */
public class CategoryAction extends ActionSupport {

	private Category category;// ����һ��˽�г�Ա��������url�������Ĳ�����ע������Ҫд��get��set����

	private CategoryService categoryService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public String update() {
		System.out.println("----update----");
		System.out.println(categoryService);// �����Ѿ���Spring���ϣ����Կ����õ����categoryService�ˣ���ӡ�����Ͳ���null��
		categoryService.update(category); // �¼�һ����䣬���������ݿ�
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