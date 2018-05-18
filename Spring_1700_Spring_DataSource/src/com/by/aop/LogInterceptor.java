package com.by.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:LogInterceptor
 * @Description:����������
 * @author:Administrator
 * @date:2018��3��24�� ����8:39:50
 */
@Aspect
@Component
public class LogInterceptor {
	@Pointcut("execution(public * com.by.service..*.add(..))")
	public void myMethod() {// ���ﲻִ�з�����
	};

	@Before("myMethod()")
	// ִ�з�����(pjp.proceed();)֮ǰִ�����·���
	public void before() {
		System.out.println("method before");
	}

	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start");
		pjp.proceed();
		System.out.println("method around end");
	}

}
