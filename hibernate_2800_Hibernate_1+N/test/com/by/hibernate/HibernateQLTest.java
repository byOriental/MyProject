package com.by.hibernate;

import java.util.Date;
import java.util.EnumSet;
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

	// N+1
	// 设置关联对象为lazy,就不会发出多余语句
	@Test
	public void testQuery1() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		List<Topic> topics = (List<Topic>) session.createQuery("from Topic")
				.list();

		for (Topic t : topics) {
			System.out.println(t.getId() + "-" + t.getTitle());
		}
		session.getTransaction().commit();
		session.close();

	}

	@Test
	// 什么时候用到关联对象什么时候发出sql语句
	public void testQuery2() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		List<Topic> topics = (List<Topic>) session.createQuery("from Topic")
				.list();

		for (Topic t : topics) {
			System.out.println(t.getId() + "-" + t.getTitle());
			System.out.println(t.getCategory().getName());
		}
		session.getTransaction().commit();
		session.close();

	}

	// @BatchSize，在实体类设置，控制发出sql数量
	@Test
	public void testQuery3() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		List<Topic> topics = (List<Topic>) session.createQuery("from Topic")
				.list();

		for (Topic t : topics) {
			System.out.println(t.getId() + "-" + t.getTitle());
			System.out.println(t.getCategory().getName());
		}
		session.getTransaction().commit();
		session.close();

	}

	// join fetch
	@Test
	public void testQuery4() {
		Session session = sf.openSession();
		session.beginTransaction();
		// List<Topic> topics =
		// (List<Topic>)session.createCriteria(Topic.class).list();
		List<Topic> topics = (List<Topic>) session.createQuery(
				"from Topic t left join fetch t.category c").list();

		for (Topic t : topics) {
			System.out.println(t.getId() + "-" + t.getTitle());
			System.out.println(t.getCategory().getName());
		}
		session.getTransaction().commit();
		session.close();

	}

	public static void main(String[] args) {
		beforeClass();
	}
}
