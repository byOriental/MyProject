package com.by.regisration.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @Title:ConsumerAction
 * @Description:xxAction(ע��[��Ҫ����struts2-spring-plugin.jar])---xxManager(ע��)---xxDao(ע��)---DB
 * @author:Administrator
 * @date:2018��4��10�� ����9:32:02
 */
@Component("consumer")
@Scope("prototype")
public class ConsumerAction extends ActionSupport {
	private String username;
	private String password;
	private String password2;

	private ConsumerManager cm;

	public ConsumerManager getCm() {
		return cm;
	}

	@Resource(name = "consumerManager")
	public void setCm(ConsumerManager cm) {
		this.cm = cm;
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
