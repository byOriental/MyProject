package com.by.regisration.dao;

import java.util.List;

import com.by.registration.model.Consumer;

public interface ConsumerDao {
	public void save(Consumer c);

	public boolean checkExists(String name);

	public List<Consumer> getConsumers();
}
