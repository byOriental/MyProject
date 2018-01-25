package com.by.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @Title:HibernateCoreAPITest
 * @Description:���������
 * @author:Administrator
 * @date:2018��1��4�� ����11:17:34
 */
public class HibernateCoreAPITest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
	}

	// ���������״̬&&getCurrentSession()��openSession()����
	@Test
	public void testSava() {
		Teacher t = new Teacher();
		System.out.println("new�Ժ��idΪTransient:" + t.getId());
		t.setName("ws");
		t.setAge(18);
		t.setAddress("earth");
		// Session sessionOp1 = sf.openSession();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(t);// ���������Ŷ����ID(hashmap)
		System.out.println("sava�Ժ��idΪPersistent:" + t.getId());
		Session session1 = sf.getCurrentSession();
		System.out.println(session == session1);// getCurrentSession()�ύǰ���������л���������ͬһ��session
		session.getTransaction().commit();
		System.out.println("commit�Ժ��idΪDetached:" + t.getId());
		// Session sessionOp2 = sf.openSession();
		Session session2 = sf.getCurrentSession();
		System.out.println(session == session2);// getCurrentSession()�ύ��������������ʧfalse
		// System.out.println(sessionOp2 == sessionOp1);
		// session.close();//�����ύ���߻ع����Զ��رտ�������Ҫ�ֶ��ر�
	}

	@Test
	public void testSaveWith3State() {
		Teacher t = new Teacher();
		t.setName("t1");
		t.setAge(22);
		t.setAddress("beijing");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		System.out.println(t.getId());
		session.getTransaction().commit();

		System.out.println("�ύ���ȡid:" + t.getId());// ����
	}

	@Test
	public void testDelete() {
		Teacher teacher = new Teacher();
		teacher.setAge(19);
		teacher.setName("by");
		teacher.setAddress("shanghai");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();

		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.delete(teacher); // ɾ��teacher����(����)
		session3.getTransaction().commit();
	}

	@Test
	public void testLoad() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		//
		Teacher teacher2 = (Teacher) session.load(Teacher.class, 12);
		// Teacher teacher2 = (Teacher) session.load(Teacher.class,
		// 55);//�����ڣ�����sql���
		// ֻ����get�����Ժ󣬲Ż��ʼ������̬�����࣬��̬������Żᱻ���ص��ڴ棬���򲻻ᱻ���ء�
		System.out.println("method of load---" + teacher2.getAddress());
		session.getTransaction().commit();
		System.out.println(teacher2.getName());// �����õ�
		System.out.println(teacher2.getClass()); // ��ȡhibernate����õĶ�̬������Teacher_$$_jvst63_0

	}

	@Test
	public void testGet() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher teacher2 = (Teacher) session.get(Teacher.class, 8);
		// System.out.println("method of get---" + teacher2.getAddress());//
		// �����õ�
		session.getTransaction().commit();
		System.out.println(teacher2.getClass());// ��ȡ��ʵ��Teacher
		System.out.println("method of get---" + teacher2.getAddress());// �����õ�

	}

	@Test
	// load/get�����Ķ��󣬽����ύʱ���Զ�update
	public void testUpdate1() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 6);
		t.setName("byoood");
		session.getTransaction().commit();// d��Ϊd״̬ �ڴ��С����ݿ��С�����û��
		t.setAge(35); // ������ֵ�����ǿ����µ�session����commit��ָ�򻺴�Ķ������ñ�����(load&&getһ��)����Ϊdetached�����룩����
		System.out.println(t.getAddress());// ����ȡֵ��
		System.out.println(t.getClass());// ����ȡֵ��get��ȡ��ʵ�࣬load��ȡ��̬�����ࣩ��

	}

	@Test
	// ����ʱ��û��ָ��������������id������
	public void testUpdate2() {
		Teacher t = new Teacher();
		t.setAddress("guizhou");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();

	}

	@Test
	// ָ��id���и��³ɹ�
	public void testUpdate3() {
		Teacher t = new Teacher();
		t.setAddress("guizhou");
		t.setId(9);
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();

	}

	@Test
	// ����ʱ��������ݿ����ڴ������Ƿ�һ�£���һ���Զ���update���
	public void testUpdate4() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 3);
		t.setName("tinsw");
		session.getTransaction().commit();

	}

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setName("luzhenqiong");
		student.setAge(2);
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
	}

	@Test
	// load�ύ���ٴθ���ʱ�����ش���session
	public void testUpdate5() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();// **����ʼ�Ժ���ܶ����ݵ�һ�в���
		Student s = (Student) session.load(Student.class, 1);// ͨ�������ָ��id��
		s.setAge(20);
		session.getTransaction().commit(); // ͬһ��session����update
		// ���¸���ȫ�����
		s.setName("mengmengdear");
		Session session1 = sf.getCurrentSession();
		session1.beginTransaction();
		session1.update(s);// �½�sessionֻ�ܴ����ݿ�ȫload����
		session1.getTransaction().commit();

	}

	@Test
	// load�ύ���ٴθ���ʱ�����ش���session
	public void testUpdate5_1() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, 1);
		s.setName("zhangsan5");
		session.getTransaction().commit();

		s.setName("z4");

		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.update(s);// Ϊ�־û�״̬
		session2.getTransaction().commit();
	}

	@Test
	// merge�������ϲ��� . �½�sessionֻ�ܴ����ݿ�ȫload������merge��ԭ���Ķ���obj״̬Ϊ�ѹܡ�
	public void testUpdate6() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Student s = (Student) session.load(Student.class, 1);
		s.setAge(16);
		session.getTransaction().commit(); // ͬһ��session����update

		// ���¸���ȫ�������бȽ�
		s.setName("tiantia");
		Session session1 = sf.getCurrentSession();
		session1.beginTransaction();
		session1.merge(s);
		session1.getTransaction().commit();

	}

	@Test
	// ͨ����Query���²��ָ��ĵ��ֶ�
	public void testUpdate7() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Query q = session
				.createQuery("update Student s set s.name='z5' where s.id = 1");
		q.executeUpdate();
		session.getTransaction().commit();

	}

	@Test
	public void testSaveOrUpdate() {

		Teacher t = new Teacher();
		t.setName("t4");
		t.setAddress("kunming");
		t.setAge(77);

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(t);// ����save

		session.getTransaction().commit();

		t.setName("t5");

		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.saveOrUpdate(t);// ����update
		session2.getTransaction().commit();

	}

	@Test
	// �������󣬵��ٴ���teacher����ʱ����������ݿ�select(���η���select���)
	public void testClear() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher teacher = (Teacher) session.load(Teacher.class, 2);
		System.out.println(teacher.getName());
		session.clear();

		Teacher teacher1 = (Teacher) session.load(Teacher.class, 2);
		System.out.println(teacher1.getName());
		session.getTransaction().commit();
	}

	@Test
	public void testFlush() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 2);
		t.setName("tttt");
		session.clear();
		t.setName("ttttt");

		session.getTransaction().commit();

	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
