package com.by.registration.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.by.registration.model.Consumer;
import com.by.registration.util.HibernateUtil;

public class ConsumerManager {
	public boolean exists(Consumer c) throws Exception {
		HibernateUtil hUtil = new HibernateUtil();
		SessionFactory sessionFactory = hUtil.getSessionFactory();
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		long count = (Long) s
				.createQuery(
						"select count(*) from Consumer c where c.username =:username")
				.setString("username", c.getUsername()).uniqueResult();
		s.getTransaction().commit();
		if (count > 0)
			return true; // 返回true存在
		return false; // 返回false不存在

	}

	public void add(Consumer c) throws Exception {
		HibernateUtil hUtil = new HibernateUtil();
		SessionFactory sessionFactory = hUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
}
