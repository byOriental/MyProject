package com.by.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:LogInterceptor
 * @Description:����������
 * @author:Administrator
 * @date:2018��3��24�� ����8:39:50
 */
// �����߼�---������߼����루�У�����������֮��
@Aspect
@Component
public class LogInterceptor {
	@Before("execution(public void com.by.dao.impl.UserDAOImpl.save(com.by.model.User)")
	public void before() {
		System.out.println("method start!");
	}

}
