package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Category;
//����Ϊ�Լ�ҵ�������¹���
//CategoryService�ӿ�  

public interface CategoryService extends BaseService<Category> {
	// ��ѯ�����Ϣ����������Ա
	public List<Category> queryJoinAccount(String type, int page, int size); // ʹ���������Ʋ�ѯ
	// ���ݹؼ��ֲ�ѯ�ܼ�¼��

	public Long getCount(String type);

	public void deleteByIds(String ids);
}
