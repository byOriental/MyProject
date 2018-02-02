package com.by.hibernate;

import java.util.EnumSet;

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

/**
 * 
 * @Title:HibernateORMappingTest
 * @Description:继承关系的映射
 * @author:Administrator
 * @date:2018年2月2日 下午1:19:41
 */
public class HibernateORMappingTest {
	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void beforeClass() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}

	@Test
	public void testSave() {
		Student s = new Student();
		s.setName("s1");
		s.setScore(80);
		Student s1 = new Student();
		s1.setName("s11");
		s1.setScore(800);
		Teacher t = new Teacher();
		t.setName("t1");
		t.setTitle("java");

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testLoad() {

		testSave();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student s = (Student) session.load(Student.class, 2);
		System.out.println(s.getScore());
		Person p = (Person) session.load(Person.class, 2);
		System.out.println(p.getName()); // 不能指定具体哪一个对象
		session.getTransaction().commit();
		session.close();

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

	public static void main(String[] args) {
		beforeClass();
	}
}
