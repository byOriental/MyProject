package com.by.shop.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.by.shop.model.Category;
import com.by.shop.service.CategoryService;
import com.by.shop.utils.HibernateSessionFactory;

/**
 * 
 * @Title:CategoryServiceImpl
 * @Description:ֱ�Ӳ������ݿ�
 * @author:Administrator
 * @date:2018��4��18�� ����12:22:29
 */
public class CategoryServiceImpl implements CategoryService {

	@Override
	// û�к�Spring���ϵ����
	public void save(Category category) {
		// ͨ���ո����ɵ�sessionFactory��ȡsession
		Session session = HibernateSessionFactory.getSession();
		try {
			// �ֶ�����
			session.getTransaction().begin();
			// ִ��ҵ���߼�
			session.save(category);
			// �ֶ��ύ
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	/* Spring��Hibernate������ */
	private SessionFactory sessionFactory; // ����һ��sessionFactory

	// ����Ҫʹ��sessoinFactory��ʱ��Spring�ὫsessionFactoryע�����
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		// �ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session
		return sessionFactory.getCurrentSession();
	}

	@Override
	// Spring��Hibernate���Ϻ�����
	public void update(Category category) {
		getSession().update(category);
	}
}
