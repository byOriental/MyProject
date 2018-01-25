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
 * @Title:HibernateCoreAPITest
 * @Description:���������
 * @author:Administrator
 * @date:2018��1��4�� ����11:17:34
 */
public class HibernateCoreAPITest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {
		sf = new Configuration().configure().buildSessionFactory();
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("u1");
		Group group = new Group();
		group.setName("g1");
		user.setGroup(group);// ��������֮�����
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	// cascade����Ӱ���ȡ����cud,fetch�ܶ�ȡ
	@Test
	public void testSaveGroup() {
		User u1 = new User();
		u1.setName("u1");
		User u2 = new User();
		u2.setName("u2");
		Group g = new Group();
		g.setName("g1");
		g.getUsers().add(u1);
		g.getUsers().add(u2);
		u1.setGroup(g);
		u2.setGroup(g);
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		// s.save(g);
		s.save(g);
		s.getTransaction().commit();
	}

	@Test
	// �����ʱgroup��fetchҲ��Ϊeager,��ô����������select���
	public void testGetUser() {

		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, 2);
		session.getTransaction().commit();
		System.out.println(user.getGroup().getName());// ��ӡidΪ2��user��Ӧ��group
	}

	// user��fetchֵ���ò�һ����ִ�����˳��һ����one.fetch=eager&&many.fetch=eager(ͨ��һ����eager����)ʱ
	// ������select��䡣��one.fetch=lazy&&many.fetch=eagerʱ������һ��select��䡣ֵ����һ��
	@Test
	public void testLoadUser() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.load(User.class, 2);
		System.out.println(user.getName());
		session.getTransaction().commit();
		// session��(�Ѿ����ύ)�������group��ص�����Ϊlazy(ֻ�����Լ�)����ôgroup����eager����lazy����ȡ�������ݵģ���Ϊû�б����ص��ڴ�
		// System.out.println(user.getGroup());
		System.out.println(user.getGroup().getName());//
		// user��fetchΪlazy��ʲôʱ����ʲôʱ��ȡ����û�м��ص��ڴ��У�user.getGroup().getName()ʱ�����쳣,û�б����ص��ڴ档
	}

	@Test
	public void testGetGroup() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Group group = (Group) session.get(Group.class, 1);
		session.getTransaction().commit();// �ύsession(��groupһ��Ϊeager),��ȡ�����ݣ�ֱ�Ӵ��ڴ���ȡ��
		for (User user : group.getUsers()) {
			System.out.println(user.getName());
		}
	}

	@Test
	public void testUpdateUser() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, 2);
		session.getTransaction().commit();

		// persist����
		// User user = new User();
		// user.setName("ps_username");
		// Group group = new Group();
		// group.setName("ps_grouname");
		// user.setGroup(group);

		user.setName("ud_user");
		user.getGroup().setName("ud_group");
		// ���¿�session���и���
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.update(user);
		// session2.persist(user);// CascadeType.ALL���Լ���
		session2.getTransaction().commit();
	}

	@Test
	// ���ַ�������ָ���ֶ�
	public void testDeleteUser() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		// User user = (User) session.get(User.class, 2);
		session.beginTransaction();
		// user.setGroup(null);//
		// ע��user��group�Ĺ���,����user������group��group����������user����ɾ��
		// session.delete(user);
		session.createQuery("delete from User u where u.id=2").executeUpdate();
		session.getTransaction().commit();

	}

	@Test
	public void testDeleteGroup() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		// session.createQuery("delete from Group g where g.id=1").executeUpdate();//
		// Υ������Լ������������ִ��
		Group group = session.get(Group.class, 1);
		session.delete(group);// ɾ��one��һ����manyһ��һ��Ҳ��ɾ�����������ݣ�
		session.getTransaction().commit();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
