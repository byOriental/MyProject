package com.by.regisration.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.by.regisration.dao.ConsumerDao;
import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;

/**
 * 
 * @Title:ConsumerManagerImpl
 * @Description:用户管理去调用dao，dao负责具体业务操作
 * @author:Administrator
 * @date:2018年4月8日 下午1:17:24
 */
@Component("consumerManager")
public class ConsumerManagerImpl implements ConsumerManager {
	private ConsumerDao consumerDao;

	public ConsumerDao getConsumerDao() {
		return consumerDao;
	}

	// 需要操作Dao类，故需要注入
	@Resource
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

	@Override
	public List<Consumer> getConsumers() {
		return this.consumerDao.getConsumers();
	}

	@Override
	public Consumer loadById(int id) {

		return this.consumerDao.loadById(id);
	}
}
