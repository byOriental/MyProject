package com.by.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

@Component
public class SuperDAO extends HibernateDaoSupport {
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

}
