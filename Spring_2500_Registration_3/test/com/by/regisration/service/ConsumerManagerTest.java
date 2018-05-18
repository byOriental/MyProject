package com.by.regisration.service;

import org.junit.Assert;
import org.junit.Test;

import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;

public class ConsumerManagerTest {

	@Test
	public void testExists() throws Exception {
		ConsumerManager um = new ConsumerManager();
		Consumer u = new Consumer();
		u.setUsername("x");
		u.setPassword("x");
		boolean exists = um.exists(u);
		Assert.assertEquals(true, exists);
	}

	@Test
	public void testAdd() throws Exception {
		ConsumerManager um = new ConsumerManager();
		Consumer u = new Consumer();
		u.setUsername("w");
		u.setPassword("w");
		boolean exists = um.exists(u);
		if (!exists) {
			um.add(u);
			u.setUsername("c");
			Assert.assertEquals(true, um.exists(u));

		} else {
			Assert.fail("not added");
		}

	}

}
