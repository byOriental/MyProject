package com.by.registration.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.by.regisration.action.ConsumerAction;
import com.by.registration.vo.ConsumerRegisterInfo;

public class ConsumerActionTest {

	@Test
	public void testExecute() throws Exception {
		ConsumerAction ca = new ConsumerAction();
		ConsumerRegisterInfo info = new ConsumerRegisterInfo();
		info.setPassword("hh");
		info.setUsername("hh");
		info.setPassword2("ff");
		String ret = ca.execute();
		assertEquals("success", ret);
	}

}
