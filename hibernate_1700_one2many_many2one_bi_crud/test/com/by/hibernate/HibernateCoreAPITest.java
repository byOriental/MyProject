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
 * @Description:事务的区别
 * @author:Administrator
 * @date:2018年1月4日 上午11:17:34
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
		user.setGroup(group);// 设置他们之间关联
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	// cascade并不影响读取，管cud,fetch管读取
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
	// 如果此时group的fetch也设为eager,那么将发出两条select语句
	public void testGetUser() {

		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, 2);
		session.getTransaction().commit();
		System.out.println(user.getGroup().getName());// 打印id为2的user对应的group
	}

	// user中fetch值设置不一样，执行语句顺序不一样。one.fetch=eager&&many.fetch=eager(通常一边设eager即可)时
	// 发两次select语句。当one.fetch=lazy&&many.fetch=eager时，发出一次select语句。值都是一样
	@Test
	public void testLoadUser() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		User user = (User) session.load(User.class, 2);
		System.out.println(user.getName());
		session.getTransaction().commit();
		// session外(已经被提交)，如果与group相关的类置为lazy(只加载自己)，那么group不论eager还是lazy都是取不出数据的，因为没有被加载到内存
		// System.out.println(user.getGroup());
		System.out.println(user.getGroup().getName());//
		// user的fetch为lazy（什么时候用什么时候取，并没有加载到内存中）user.getGroup().getName()时出现异常,没有被加载到内存。
	}

	@Test
	public void testGetGroup() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Group group = (Group) session.get(Group.class, 1);
		session.getTransaction().commit();// 提交session(在group一端为eager),能取出数据（直接从内存中取）
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

		// persist测试
		// User user = new User();
		// user.setName("ps_username");
		// Group group = new Group();
		// group.setName("ps_grouname");
		// user.setGroup(group);

		user.setName("ud_user");
		user.getGroup().setName("ud_group");
		// 重新开session进行更新
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.update(user);
		// session2.persist(user);// CascadeType.ALL所以级联
		session2.getTransaction().commit();
	}

	@Test
	// 两种方法更新指定字段
	public void testDeleteUser() {
		testSaveGroup();
		Session session = sf.getCurrentSession();
		// User user = (User) session.get(User.class, 2);
		session.beginTransaction();
		// user.setGroup(null);//
		// 注销user与group的关联,否则user级联的group、group级联的其他user都被删除
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
		// 违反完整约束条件，不能执行
		Group group = session.get(Group.class, 1);
		session.delete(group);// 删除one这一方，many一方一般也被删除（垃圾数据）
		session.getTransaction().commit();
	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
