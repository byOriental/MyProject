package com.by.dao.impl;

import org.springframework.stereotype.Component;

import com.by.dao.LogDAO;
import com.by.model.ByLog;

@Component("logDAO")
public class LogDAOImpl extends SuperDAO implements LogDAO {

	public void save(ByLog log) {
		this.getHibernateTemplate().save(log);
	}

}
