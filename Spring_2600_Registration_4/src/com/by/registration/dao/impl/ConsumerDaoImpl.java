package com.by.registration.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.by.regisration.dao.ConsumerDao;
import com.by.registration.model.Consumer;
import com.by.registration.util.HibernateUtil;

public class ConsumerDaoImpl implements ConsumerDao {

	@Override
	public void save(Consumer c) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public boolean checkExists(String username) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		long count = (Long) s
				.createQuery(
						"select count(*) from Consumer c where c.username =:username")
				.setString("username", username).uniqueResult();
		s.getTransaction().commit();
		if (count > 0)
			return true; // 返回true存在
		return false; // 返回false不存在
	}

}
