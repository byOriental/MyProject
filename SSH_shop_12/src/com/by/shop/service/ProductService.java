package com.by.shop.service;

import java.util.List;

import com.by.shop.model.Product;

//ProductService�ӿڼ̳�BaseService<Product>  
public interface ProductService extends BaseService<Product> {
	// ��ѯ��Ʒ��Ϣ���������
	public List<Product> queryJoinCategory(String type, int page, int size); // ʹ����Ʒ�����Ʋ�ѯ
	// ���ݹؼ��ֲ�ѯ�ܼ�¼��

	public Long getCount(String type);
}