package com.by.regisration.service.impl;

import com.by.regisration.dao.ConsumerDao;
import com.by.registration.dao.impl.ConsumerDaoImpl;
import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;

/**
 * 
 * @Title:ConsumerManagerImpl
 * @Description:用户管理去调用dao，dao负责具体业务操作
 * @author:Administrator
 * @date:2018年4月8日 下午1:17:24
 */
public class ConsumerManagerImpl implements ConsumerManager {
	ConsumerDao consumerDao = new ConsumerDaoImpl();

	public ConsumerDao getConsumerDao() {
		return consumerDao;
	}

	public void setConsumerDao(ConsumerDao consumerDao) {
		this.consumerDao = consumerDao;
	}

	@Override
	public boolean exists(Consumer c) {

		return consumerDao.checkExists(c.getUsername());

	}

	@Override
	public void add(Consumer c) {
		consumerDao.save(c);
	}
}
