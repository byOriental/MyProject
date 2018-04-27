package com.by.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.by.shop.model.Product;
import com.by.shop.service.ProductService;

@SuppressWarnings("unchecked")
@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements
		ProductService {

	@Override
	public List<Product> queryJoinCategory(String name, int page, int size) {
		System.out.println("级联问题-----");
		// String hql =
		// "from Product p left join fetch p.category c left join fetch c.account where p.name like :name";
		/**
		 * 级联问题，执行到这一步进行不下去
		 */
		String hql = "from Product p left join fetch p.category where p.name like :name";
		return getSession().createQuery(hql)
				.setString("name", "%" + name + "%")
				.setFirstResult((page - 1) * size) // 从第几个开始显示
				.setMaxResults(size) // 显示几个
				.list();
	}

	@Override
	public Long getCount(String name) {
		String hql = "select count(p) from Product p where p.name like :name";
		return (Long) getSession().createQuery(hql)
				.setString("name", "%" + name + "%").uniqueResult(); // 返回一条记录:总记录数
	}

}
