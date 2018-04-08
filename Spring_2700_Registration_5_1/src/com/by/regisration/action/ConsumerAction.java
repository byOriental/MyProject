package com.by.regisration.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;
import com.opensymphony.xwork2.ActionSupport;

public class ConsumerAction extends ActionSupport {
	private String username;
	private String password;
	private String password2;

	private ConsumerManager cm;

	public ConsumerManager getCm() {
		return cm;
	}

	public void setCm(ConsumerManager cm) {
		this.cm = cm;
	}

	// 通过构造函数初始化并获取bean
	public ConsumerAction() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		cm = (ConsumerManager) ctx.getBean("consumerManager");
	}

	public String execute() throws Exception {
		Consumer c = new Consumer();
		c.setUsername(username);
		c.setPassword(password);
		if (cm.exists(c)) {
			return "fail";
		}
		cm.add(c);
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
