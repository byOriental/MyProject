package com.by.shop.service.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.by.shop.service.BaseService;

/**
 * @Description TODO������ģ��ĳ�ȡ��
 * @author eson_15
 * 
 */
public class BaseServiceImpl<T> implements BaseService<T> {

	private Class clazz; // clazz�д洢�˵�ǰ���������ͣ�������T

	private SessionFactory sessionFactory;

	public BaseServiceImpl() {
		// ����������ӡ��Ϣ����ȥ���������Ǹ��Լ�����
		System.out.println("this������ǵ�ǰ���ù��췽���Ķ���" + this);
		System.out.println("��ȡ��ǰthis����ĸ�����Ϣ" + this.getClass().getSuperclass());
		System.out.println("��ȡ��ǰthis����ĸ�����Ϣ(����������Ϣ)"
				+ this.getClass().getGenericSuperclass());
		// �õ����͵Ĳ�������
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		// �ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(T t) {
		getSession().save(t);
		System.out.println("save'session:" + getSession().getClass().getName());
	}

	@Override
	public void update(T t) {
		getSession().update(t);
		System.out.println("save'session:" + getSession().getClass().getName());
	}

	@Override
	public void delete(int id) {
		System.out.println(clazz.getSimpleName());
		String hql = "delete " + clazz.getSimpleName() + " as c where c.id=:id";
		getSession().createQuery(hql) //
				.setInteger("id", id) //
				.executeUpdate();
	}

	@Override
	public T get(int id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> query() {
		String hql = "from " + clazz.getSimpleName();
		// String hql = "from Category";
		Session session = getSession();
		System.out
				.println("query'session name:" + session.getClass().getName());
		return getSession().createQuery(hql).list();
	}

}
