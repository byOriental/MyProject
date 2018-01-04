package com.by.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @Title:TeacherTest
 * @Description:这是一个测试类
 * @author:Administrator
 * @date:2018年1月2日 下午11:40:19
 */
public class TeacherTest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		Teacher t = new Teacher();
		t.setName("t2");
		t.setTitle("shanghai");

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
