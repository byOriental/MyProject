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
 * @Description:面向切面编程
 * @author:Administrator
 * @date:2018年3月24日 下午8:39:50
 */
@Aspect
@Component
public class LogInterceptor {
	@Pointcut("execution(public * com.by.service..*.add(..))")
	public void myMethod() {// 这里不执行方法体
	};

	@Before("myMethod()")
	// 执行方法体(pjp.proceed();)之前执行以下方法
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
