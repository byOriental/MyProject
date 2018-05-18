package com.by.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.by.dao.LogDAO;
import com.by.model.ByLog;

@Component("logDAO")
public class LogDAOImpl implements LogDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(ByLog log) {

		System.out.println("sessionfactroy class:" + sessionFactory.getClass());
		Session s = sessionFactory.getCurrentSession();
		// s.beginTransaction(); 默认thread事务，直接使用
		s.save(log);
		// throw new RuntimeException("error!");
	}

}
