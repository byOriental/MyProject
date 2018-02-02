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
 * @Description:�̳й�ϵ��ӳ��
 * @author:Administrator
 * @date:2018��2��2�� ����1:19:41
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
		Org o = new Org();
		o.setName("�ܹ�˾");
		Org o1 = new Org();
		o1.setName("�ֹ�˾1");
		Org o2 = new Org();
		o2.setName("�ֹ�˾2");
		Org o11 = new Org();
		o11.setName("�ֹ�˾1_1");
		Org o12 = new Org();
		o12.setName("�ֹ�˾1_2");

		o.getChildren().add(o1);
		o.getChildren().add(o2);
		o1.getChildren().add(o11);
		o1.getChildren().add(o12);
		o11.setParent(o1);
		o12.setParent(o1);
		o1.setParent(o);
		o2.setParent(o);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testLoad() {
		testSave();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Org o = (Org) session.load(Org.class, 1);
		print(o, 0);
		session.getTransaction().commit();
		session.close();

	}

	// �ݹ����
	private void print(Org o, int level) {
		String preStr = ""; // ���ַ���
		for (int i = 0; i < level; i++) {
			preStr += "----";
		}
		System.out.println(preStr + o.getName());
		for (Org child : o.getChildren()) {// ��������children
			print(child, level + 1);
		}
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
