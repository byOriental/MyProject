package com.by.regisration.service;

import org.junit.Assert;
import org.junit.Test;

import com.by.regisration.service.impl.ConsumerManagerImpl;
import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;

public class ConsumerManagerTest {

	@Test
	public void testExists() throws Exception {
		ConsumerManager um = new ConsumerManagerImpl();
		Consumer u = new Consumer();
		u.setUsername("x");
		u.setPassword("x");
		boolean exists = um.exists(u);
		Assert.assertEquals(true, exists);
	}

	@Test
	public void testAdd() throws Exception {
		ConsumerManager um = new ConsumerManagerImpl();
		Consumer u = new Consumer();
		u.setUsername("u");
		u.setPassword("u");
		boolean exists = um.exists(u);
		if (!exists) {
			um.add(u);
			Assert.assertEquals(true, um.exists(u));

		} else {
			Assert.fail("not added");
		}

	}

}
