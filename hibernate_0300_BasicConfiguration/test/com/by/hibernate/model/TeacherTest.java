package com.by.hibernate.model;

import java.util.Date;

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
public class TeacherTest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {// ���ȼ��أ�Ҳ�����þ�̬����飩,�Ż�������ִ���ٶ�
		// �����ļ�������д����ȷ�������쳣ʱ�Ĵ���취��
		// try {
		// sf = new Configuration().configure().buildSessionFactory();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		Teacher t = new Teacher();
		t.setId(7);
		t.setName("t1");
		t.setTitle("annotation method");
		t.setMySweetHeart("xh");
		t.setBirDate(new Date());
		t.setZhichen(ZhiChen.B);

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	// �����ļ�������д����ȷ�������쳣ʱ�Ĵ���취һ
	// public static void main(String args[]) {
	// beforeClass();
	// }

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
