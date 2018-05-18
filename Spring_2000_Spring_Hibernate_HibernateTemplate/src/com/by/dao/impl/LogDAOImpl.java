package com.by.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.by.dao.LogDAO;
import com.by.model.ByLog;

@Component("logDAO")
public class LogDAOImpl implements LogDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(ByLog log) {
		hibernateTemplate.save(log);
	}

}
