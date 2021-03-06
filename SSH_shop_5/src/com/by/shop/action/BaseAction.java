package com.by.shop.action;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.service.AccountService;
import com.by.shop.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller("baseAction")
// prototype类型，默认是使用时创建，不是启动时自动创建
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, ModelDriven<T> {

	// service对象
	@Resource
	protected CategoryService categoryService;
	@Resource
	protected AccountService accountService;

	// 只要实现ModelDriven接口就不用再地址栏赋值 对象.属性=值 而是 属性=值了
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	protected T model;// 公共的model,根据实现类提供的泛型类型决定具体model对象

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public T getModel() { // 这里通过解析传进来的T来new一个对应的instance
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		Class clazz = (Class) type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return model;
	}
}