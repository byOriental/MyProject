package com.by.shop.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;
import com.by.shop.utils.HibernateSessionFactory;

/**
 * 
 * @Title:CategoryServiceImpl
 * @Description:直接操作数据库
 * @author:Administrator
 * @date:2018年4月18日 上午12:22:29
 */
public class CategoryServiceImpl implements CategoryService {

	@Override
	// 没有和Spring整合的情况
	public void save(Category category) {
		// 通过刚刚生成的sessionFactory获取session
		Session session = HibernateSessionFactory.getSession();
		try {
			// 手动事务
			session.getTransaction().begin();
			// 执行业务逻辑
			session.save(category);
			// 手动提交
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	/* Spring和Hibernate整个后 */
	private SessionFactory sessionFactory; // 定义一个sessionFactory

	// 当需要使用sessoinFactory的时候，Spring会将sessionFactory注入进来
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		// 从当前线程获取session，如果没有则创建一个新的session
		return sessionFactory.getCurrentSession();
	}

	@Override
	// Spring和Hibernate整合后的情况
	public void update(Category category) {
		getSession().update(category);
	}
}
