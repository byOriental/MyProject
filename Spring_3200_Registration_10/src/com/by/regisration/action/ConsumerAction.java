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
 * @Description:xxAction(注入[需要导入struts2-spring-plugin.jar])---xxManager(注入)---xxDao(注入)---DB
 * @author:Administrator
 * @date:2018年4月10日 上午9:32:02
 */
// struts2-spring-plugin.jar会到struts2.xml找到名字为“consumer”的action,将其放入到容器里面进行初始化
// 多例，每个请求都会生成一个新的action
@Component("c")
@Scope("prototype")
public class ConsumerAction extends ActionSupport implements ModelDriven {
	/*
	 * 使用驱动模型进行参数接收1.实现ModelDriven接口重写getModel()方法(直接返回对象)。2.手动new
	 * vo对象。3.vo（valueobject）必须有一个无参构造方法
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

	// 没有手动注入@Resource时，loadById(info.getId())方法不能执行
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
