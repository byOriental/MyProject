package com.by.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.by.hibernate.model.Teacher;
import com.by.hibernate.model.ZhiChen;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setId(8);
		t.setName("t1");
		t.setTitle("annotation method");
		t.setMySweetHeart("shanshan");
		t.setBirDate(new Date());
		t.setZhichen(ZhiChen.C);

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
