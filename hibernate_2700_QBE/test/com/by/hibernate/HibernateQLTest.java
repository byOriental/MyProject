package com.by.hibernate;

import java.util.Date;
import java.util.EnumSet;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
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

	// is empty and is not empty
	// query by criteria(QBC) query by example(QBE)
	@Test
	public void testQBE() {
		Session session = sf.openSession();
		session.beginTransaction();
		Topic tExample = new Topic();
		tExample.setTitle("T_");
		// 在topic中查询大于2小于8且表一包含“T_”的topic信息
		Example e = Example.create(tExample).ignoreCase().enableLike();// 拟定案例
		Criteria c = session.createCriteria(Topic.class)
				.add(Restrictions.gt("id", 2)).add(Restrictions.lt("id", 8))
				.add(e);// 效仿案例

		for (Object o : c.list()) {
			Topic t = (Topic) o;
			System.out.println(t.getId() + "-" + t.getTitle());
		}
		session.getTransaction().commit();
		session.close();

	}

	public static void main(String[] args) {
		beforeClass();
	}
}
