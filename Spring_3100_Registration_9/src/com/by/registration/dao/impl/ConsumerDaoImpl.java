package com.by.registration.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.by.regisration.dao.ConsumerDao;
import com.by.registration.model.Consumer;

/**
 * 
 * @Title:ConsumerDaoImpl
 * @Description:直接操作数据库
 * @author:Administrator
 * @date:2018年4月10日 上午9:24:05
 */
@Component("consumerDao")
public class ConsumerDaoImpl implements ConsumerDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	// 需要SessionFactory尽心数据库操作，故需要注入
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

	// 参考程序hibernate2900
	@Override
	public List<Consumer> getConsumers() {
		Session s = sf.openSession();
		// Session s = sf.currentSession(); 不能使用
		List<Consumer> list = (List<Consumer>) s.createQuery("from Consumer")
				.list();

		return list;
	}

}
