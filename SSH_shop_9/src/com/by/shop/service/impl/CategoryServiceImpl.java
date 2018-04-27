package com.by.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;

//CategoryServiceImplʵ����  
@SuppressWarnings("unchecked")
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements
		CategoryService {

	@Override
	public List<Category> queryJoinAccount(String type, int page, int size) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%")
				.setFirstResult((page - 1) * size) // �ӵڼ�����ʼ��ʾ
				.setMaxResults(size) // ��ʾ����
				.list();
	}

	@Override
	public Long getCount(String type) {
		String hql = "select count(c) from Category c where c.type like :type";
		return (Long) getSession().createQuery(hql)
				.setString("type", "%" + type + "%").uniqueResult(); // ����һ����¼:�ܼ�¼��
	}
}
