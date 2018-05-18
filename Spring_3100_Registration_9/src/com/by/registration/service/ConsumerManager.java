package com.by.registration.service;

import java.util.List;

import com.by.registration.model.Consumer;

public interface ConsumerManager {
	public boolean exists(Consumer c) throws Exception;

	public void add(Consumer c) throws Exception;

	public List<Consumer> getConsumers();
}
