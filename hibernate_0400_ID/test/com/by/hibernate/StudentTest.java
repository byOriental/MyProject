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
 * @Description:����һ��������
 * @author:Administrator
 * @date:2018��1��2�� ����11:40:19
 */
public class StudentTest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		Student t = new Student();
		t.setName("t1");
		t.setAge(18);

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
