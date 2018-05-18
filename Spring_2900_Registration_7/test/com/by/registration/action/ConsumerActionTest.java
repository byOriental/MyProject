package com.by.registration.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.by.regisration.action.ConsumerAction;

public class ConsumerActionTest {

	@Test
	public void testExecute() throws Exception {
		ConsumerAction ca = new ConsumerAction();
		ca.setUsername("h");
		ca.setPassword("h");
		String ret = ca.execute();
		assertEquals("success", ret);
	}

}
