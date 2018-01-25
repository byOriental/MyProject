package com.by.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setId(7);
		t.setName("t1");
		t.setTitle("annotation method");

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
