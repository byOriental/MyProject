package com.by.regisration.action;

import java.util.List;

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
// ������ÿ�����󶼻�����һ���µ�action
@Component("c")
@Scope("prototype")
public class ConsumerAction extends ActionSupport implements ModelDriven {
	/*
	 * ʹ������ģ�ͽ��в�������1.ʵ��ModelDriven�ӿ���дgetModel()����(ֱ�ӷ��ض���)��2.�ֶ�new
	 * vo����3.vo��valueobject��������һ���޲ι��췽��
	 */
	private ConsumerRegisterInfo info = new ConsumerRegisterInfo();
	private List<Consumer> consumers;
	private Consumer consumer;
	private ConsumerManager consumerManager;

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	public String load() {
		System.out.println("load's method begin!");
		this.consumerManager.loadById(info.getId());
		System.out.println("load's method end!");
		return "load";
	}

	public List<Consumer> getConsumers() {
		return consumers;
	}

	public void setConsumers(List<Consumer> consumers) {
		this.consumers = consumers;
	}

	public String list() {
		this.consumers = this.consumerManager.getConsumers();
		return "list";
	}

	public ConsumerRegisterInfo getInfo() {
		return info;
	}

	public void setInfo(ConsumerRegisterInfo info) {
		this.info = info;
	}

	public ConsumerManager getConsumerManager() {
		return consumerManager;
	}

	// û���ֶ�ע��@Resourceʱ��loadById(info.getId())��������ִ��
	// @Resource(name = "123gfadstG")
	@Resource(name = "consumerManager")
	public void setConsumerManager(ConsumerManager consumerManager) {
		this.consumerManager = consumerManager;
	}

	public String execute() throws Exception {
		Consumer c = new Consumer();
		c.setUsername(info.getUsername());
		c.setPassword(info.getPassword());
		if (consumerManager.exists(c)) {
			return "fail";
		}
		consumerManager.add(c);
		return "success";
	}

	// @Override
	public Object getModel() {
		return info;
	}

}
