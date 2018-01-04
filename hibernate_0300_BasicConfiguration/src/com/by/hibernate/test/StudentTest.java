package com.by.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.by.hibernate.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(5);
		student.setName("Internet");
		student.setAge(2018);

		// ServiceRegistry serviceRegistry = new
		// StandardServiceRegistryBuilder()
		// .configure().build();
		// // �����Ự��������
		// SessionFactory sf = new MetadataSources(serviceRegistry)
		// .buildMetadata().buildSessionFactory();
		// // �Ự����
		// Session session = sf.openSession();
		Configuration con = new Configuration();
		SessionFactory sf = con.configure().buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
