package com.by.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.by.hibernate.model.Teacher;

public class TeacherOldTest {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setId(7);
		t.setName("t1");
		t.setTitle("annotation method");

		// ServiceRegistry serviceRegistry = new
		// StandardServiceRegistryBuilder()
		// .configure().build();
		// // �����Ự��������
		// SessionFactory sf = new MetadataSources(serviceRegistry)
		// .buildMetadata().buildSessionFactory();
		// // �Ự����
		// Session session = sf.openSession();
		// Configuration con = new
		// AnnotationConfiguration();//�°汾��ʹ��AnnotationConfiguration
		Configuration con = new Configuration();
		SessionFactory sf = con.configure().buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
