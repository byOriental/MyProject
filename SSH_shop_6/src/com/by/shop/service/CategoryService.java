package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Category;

public interface CategoryService extends BaseService<Category> {
	/*
	 * ֻҪ���CategoryService������Ҫ���µķ������ɣ����������Ѿ���BaseService����
	 */
	// ��ѯ�����Ϣ����������Ա
	public List<Category> queryJoinAccount(String type); // ʹ���������Ʋ�ѯ

}
