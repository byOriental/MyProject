package com.by.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;

/**
 * 
 * @Title:CategoryServiceImpl
 * @Description:ֱ�Ӳ������ݿ�
 * @author:Administrator
 * @date:2018��4��18�� ����12:22:29
 */

// ��ģ�������ҵ���߼���
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements
		CategoryService {
	/*
	 * ֻ��ʵ��CategoryService�ӿ��������ķ������ɣ����������Ѿ���BaseServiceImpl��ʵ����
	 */
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * left join��ʾ����Accountһ���ѯ��fetch��ʾ��Account����ӵ�Category��ȥ��
	 * ������ֻ�ᷢһ��SQL����ˣ����ҷ��ص�Category��Ҳ������Account�����ˡ�
	 */
	public List<Category> queryJoinAccount(String type) {
		String hql = "from Category c left join fetch c.account where c.type like :type";
		// String hql = "from Category c where c.type like :type";//����1+N����
		return getSession().createQuery(hql)
				.setString("type", "%" + type + "%").list();
	}

}
