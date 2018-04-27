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
// prototype���ͣ�Ĭ����ʹ��ʱ��������������ʱ�Զ�����
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, ModelDriven<T> {

	// service����
	@Resource
	protected CategoryService categoryService;
	@Resource
	protected AccountService accountService;

	// ֻҪʵ��ModelDriven�ӿھͲ����ٵ�ַ����ֵ ����.����=ֵ ���� ����=ֵ��
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	protected T model;// ������model,����ʵ�����ṩ�ķ������;�������model����

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
	public T getModel() { // ����ͨ��������������T��newһ����Ӧ��instance
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