package com.by.regisration.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.by.registration.model.Consumer;
import com.by.registration.service.ConsumerManager;
import com.by.registration.vo.ConsumerRegisterInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @Title:ConsumerAction
 * @Description:xxAction(ע��[��Ҫ����struts2-spring-plugin.jar])---xxManager(ע��)---xxDao(ע��)---DB
 * @author:Administrator
 * @date:2018��4��10�� ����9:32:02
 */
// struts2-spring-plugin.jar�ᵽstruts2.xml�ҵ�����Ϊ��consumer����action,������뵽����������г�ʼ��
@Component("consumer")
// ������ÿ�����󶼻�����һ���µ�action
@Scope("prototype")
public class ConsumerAction extends ActionSupport implements ModelDriven {
	private ConsumerRegisterInfo info = new ConsumerRegisterInfo();

	public ConsumerRegisterInfo getInfo() {
		return info;
	}

	public void setInfo(ConsumerRegisterInfo info) {
		this.info = info;
	}

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
		c.setUsername(info.getUsername());
		c.setPassword(info.getPassword());
		if (cm.exists(c)) {
			return "fail";
		}
		cm.add(c);
		return "success";
	}

	@Override
	public Object getModel() {
		return info;
	}

}
