package com.by.hibernate;

import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

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
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testSave() {
		Session session = sf.openSession();
		session.beginTransaction();

		for (int i = 0; i < 10; i++) {
			Category c = new Category();
			c.setName("c" + i);
			Topic t = new Topic();
			t.setCategory(c);
			t.setTitle("t" + i);
			t.setCreateDate(new Date());
			session.save(c);
			session.save(t);
		}

		session.getTransaction().commit();
		session.close();
	}

	// join fetch
	// 发两次sql语句
	@Test
	public void testQueryList() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		List<Category> categories = (List<Category>) session.createQuery(
				"from Category").list();

		for (Category c : categories) {
			System.out.println(c.getName());
		}

		List<Category> categories2 = (List<Category>) session.createQuery(
				"from Category").list();
		for (Category c : categories2) {
			System.out.println(c.getName());
		}
		session.getTransaction().commit();
		session.close();

	}

	// join fetch
	// 只发一次sql语句，而且根据id号缓存数据
	@Test
	public void testQueryIterate() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		Iterator<Category> categories = (Iterator<Category>) session
				.createQuery("from Category").iterate();

		while (categories.hasNext()) {
			Category c = categories.next();
			System.out.println(c.getName());
		}

		Iterator<Category> categories2 = (Iterator<Category>) session
				.createQuery("from Category").iterate();

		while (categories2.hasNext()) {
			Category c = categories2.next();
			System.out.println(c.getName());
		}
		session.getTransaction().commit();
		session.close();

	}

	public static void main(String[] args) {
		beforeClass();
	}
}
