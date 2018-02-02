package com.by.hibernate;

import java.util.EnumSet;
import java.util.Map;

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

public class HibernateCoreAPITest {
	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void beforeClass() {
		// new SchemaExport(new
		// AnnotationConfiguration().configure()).create(false, true);
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}

	@Test
	public void testLoadGroup() {

		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		// User u = (User)s.load(User.class, 1);
		// u.setGroup(null);
		// s.delete(u);
		Group g = (Group) s.load(Group.class, 1);
		// entrySet()返回一个set<Integer, User>的对象。map接口转换为set接口
		for (Map.Entry<Integer, User> entry : g.getUsers().entrySet()) {
			System.out.println(entry.getValue().getName());
		}
		// s.createQuery("delete from User u where u.id = 1").executeUpdate();
		s.getTransaction().commit();

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