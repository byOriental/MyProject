package com.by.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title:LogInterceptor
 * @Description:面向切面编程
 * @author:Administrator
 * @date:2018年3月24日 下午8:39:50
 */
// 切面逻辑---将这个逻辑加入（切）到其他方法之上
@Aspect
@Component
public class LogInterceptor {
	@Before("execution(public void com.by.dao.impl.UserDAOImpl.save(com.by.model.User)")
	public void before() {
		System.out.println("method start!");
	}

}
