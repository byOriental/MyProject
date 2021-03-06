package com.by.hibernate;

import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HibernateQLTest {
	private static SessionFactory sf;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

	@Test
	public void testSchemaExport() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

	@Test
	public void testSave() {
		Session session = sf.openSession();
		session.beginTransaction();

		for (int i = 0; i < 10; i++) {
			Category c = new Category();
			c.setName("c" + i);
			session.save(c);
		}

		for (int i = 0; i < 10; i++) {
			Category c = new Category();
			c.setId(1);
			Topic t = new Topic();
			t.setCategory(c);
			t.setTitle("t" + i);
			t.setCreateDate(new Date());
			session.save(t);

		}

		for (int i = 0; i < 10; i++) {

			Topic t = new Topic();
			t.setId(1);
			Msg m = new Msg();
			m.setCont("m" + i);
			m.setTopic(t);
			session.save(m);

		}

		session.getTransaction().commit();
		session.close();
	}

	// list �� iterate
	@Test
	public void testQuery5() {
		Session session = sf.openSession();
		session.beginTransaction();
		Iterator<Topic> topics = session.createQuery("from Topic").iterate();
		while (topics.hasNext()) {
			System.out.println(topics.next().getTitle());
		}

		Iterator<Topic> topics2 = session.createQuery("from Topic").iterate();
		while (topics2.hasNext()) {
			System.out.println(topics2.next().getTitle());
		}

		session.getTransaction().commit();
		session.close();
	}

	// list �� iterate
	@Test
	public void testQuery6() {
		Session session = sf.openSession();
		session.beginTransaction();
		Iterator<Topic> topics = session.createQuery("from Topic").list()
				.iterator();
		while (topics.hasNext()) {
			System.out.println(topics.next().getTitle());
		}

		Iterator<Topic> topics2 = session.createQuery("from Topic").list()
				.iterator();
		while (topics2.hasNext()) {
			System.out.println(topics2.next().getTitle());
		}

		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {
		beforeClass();
	}
}