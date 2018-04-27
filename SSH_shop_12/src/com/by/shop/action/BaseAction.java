package com.by.shop.action;

import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.by.shop.service.AccountService;
import com.by.shop.service.CategoryService;
import com.by.shop.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller("baseAction")
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, ModelDriven<T> {

	// page��rows�ͷ�ҳ�йأ�pageMap��Ų�ѯ�����ݣ�Ȼ������json��ʽ�õ�
	// page��rowsʵ��get��set������pageMapֻ��Ҫʵ��get�������ɣ���ΪpageMap���ǽ���ǰ̨�����ģ�����struts��ȡ��
	protected Integer page;
	protected Integer rows;
	protected Map<String, Object> pageMap = null;// �ò�ͬ��Action�Լ�ȥʵ��
	// ��ȡҪɾ����ids��Ҫ��get��set����
	// ����������ǰ̨�������ݵģ������������struts��ȡ�ģ�Ȼ��ͨ��������ʽ����ǰ̨������ʵ��get��������
	protected String ids;
	protected InputStream inputStream;

	protected List<T> jsonList = null;
	/* ֱ��ע������������Ͳ�������set������ */
	@Resource
	protected ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Resource
	protected AccountService accountService;
	@Resource
	protected CategoryService categoryService;

	// �����
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	// ModelDriven
	protected T model;

	public List<T> getJsonList() {
		return jsonList;
	}

	public void setJsonList(List<T> jsonList) {
		this.jsonList = jsonList;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Map<String, Object> getPageMap() {
		return pageMap;
	}

	public void setPageMap(Map<String, Object> pageMap) {
		this.pageMap = pageMap;
	}

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
	public T getModel() {
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