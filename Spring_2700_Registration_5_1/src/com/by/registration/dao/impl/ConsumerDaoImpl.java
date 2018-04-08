package com.by.registration.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.by.regisration.dao.ConsumerDao;
import com.by.registration.model.Consumer;

@Component("consumerDao")
public class ConsumerDaoImpl implements ConsumerDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	@Resource
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void save(Consumer c) {
		Session session = sf.getCurrentSession();
		session.save(c);
	}

	@Override
	public boolean checkExists(String username) {
		Session s = sf.getCurrentSession();
		long count = (Long) s
				.createQuery(
						"select count(*) from Consumer c where c.username =:username")
				.setString("username", username).uniqueResult();
		if (count > 0)
			return true; // 返回true存在
		return false; // 返回false不存在
	}

}
