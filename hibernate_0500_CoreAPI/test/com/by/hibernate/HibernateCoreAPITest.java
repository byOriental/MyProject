package com.by.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
	}

	// 对象的三种状态&&getCurrentSession()、openSession()区别
	@Test
	public void testSava() {
		Teacher t = new Teacher();
		System.out.println("new以后的id为Transient:" + t.getId());
		t.setName("ws");
		t.setAge(18);
		t.setAddress("earth");
		// Session sessionOp1 = sf.openSession();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(t);// 缓存里面存放对象的ID(hashmap)
		System.out.println("sava以后的id为Persistent:" + t.getId());
		Session session1 = sf.getCurrentSession();
		System.out.println(session == session1);// getCurrentSession()提交前，上下文中还存在属于同一个session
		session.getTransaction().commit();
		System.out.println("commit以后的id为Detached:" + t.getId());
		// Session sessionOp2 = sf.openSession();
		Session session2 = sf.getCurrentSession();
		System.out.println(session == session2);// getCurrentSession()提交后，上下文中已消失false
		// System.out.println(sessionOp2 == sessionOp1);
		// session.close();//事务提交或者回滚就自动关闭看，不需要手动关闭
	}

	@Test
	public void testSaveWith3State() {
		Teacher t = new Teacher();
		t.setName("t1");
		t.setAge(22);
		t.setAddress("beijing");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		System.out.println(t.getId());
		session.getTransaction().commit();

		System.out.println("提交后获取id:" + t.getId());// 可以
	}

	@Test
	public void testDelete() {
		Teacher teacher = new Teacher();
		teacher.setAge(19);
		teacher.setName("by");
		teacher.setAddress("shanghai");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();

		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.delete(teacher); // 删除teacher对象(可以)
		session3.getTransaction().commit();
	}

	@Test
	public void testLoad() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		//
		Teacher teacher2 = (Teacher) session.load(Teacher.class, 12);
		// Teacher teacher2 = (Teacher) session.load(Teacher.class,
		// 55);//不存在，不发sql语句
		// 只有在get数据以后，才会初始化化动态代理类，动态代理类才会被加载到内存，否则不会被加载。
		System.out.println("method of load---" + teacher2.getAddress());
		session.getTransaction().commit();
		System.out.println(teacher2.getName());// 可以拿到
		System.out.println(teacher2.getClass()); // 获取hibernate编译好的动态代理类Teacher_$$_jvst63_0

	}

	@Test
	public void testGet() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher teacher2 = (Teacher) session.get(Teacher.class, 8);
		// System.out.println("method of get---" + teacher2.getAddress());//
		// 可以拿到
		session.getTransaction().commit();
		System.out.println(teacher2.getClass());// 获取真实类Teacher
		System.out.println("method of get---" + teacher2.getAddress());// 可以拿到

	}

	@Test
	// load/get出来的对象，进行提交时，自动update
	public void testUpdate1() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 6);
		t.setName("byoood");
		session.getTransaction().commit();// d变为d状态 内存有、数据库有、缓存没有
		t.setAge(35); // 不能设值（除非开启新的session）；commit后，指向缓存的对象引用被剪断(load&&get一样)，变为detached（游离）对象。
		System.out.println(t.getAddress());// 可以取值；
		System.out.println(t.getClass());// 可以取值（get获取真实类，load获取动态代理类）；

	}

	@Test
	// 更新时，没有指定具体期望对象id，报错。
	public void testUpdate2() {
		Teacher t = new Teacher();
		t.setAddress("guizhou");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();

	}

	@Test
	// 指定id进行更新成功
	public void testUpdate3() {
		Teacher t = new Teacher();
		t.setAddress("guizhou");
		t.setId(9);
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();

	}

	@Test
	// 更新时，检查数据库与内存数据是否一致，不一致自动发update语句
	public void testUpdate4() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 3);
		t.setName("tinsw");
		session.getTransaction().commit();

	}

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setName("luzhenqiong");
		student.setAge(2);
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
	}

	@Test
	// load提交后，再次更新时必须重创建session
	public void testUpdate5() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();// **事务开始以后才能对数据的一切操作
		Student s = (Student) session.load(Student.class, 1);// 通过类加载指定id号
		s.setAge(20);
		session.getTransaction().commit(); // 同一个session里面update
		// 以下更新全发语句
		s.setName("mengmengdear");
		Session session1 = sf.getCurrentSession();
		session1.beginTransaction();
		session1.update(s);// 新建session只能从数据库全load过来
		session1.getTransaction().commit();

	}

	@Test
	// load提交后，再次更新时必须重创建session
	public void testUpdate5_1() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, 1);
		s.setName("zhangsan5");
		session.getTransaction().commit();

		s.setName("z4");

		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.update(s);// 为持久化状态
		session2.getTransaction().commit();
	}

	@Test
	// merge方法“合并” . 新建session只能从数据库全load过来，merge后原来的对象obj状态为脱管。
	public void testUpdate6() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Student s = (Student) session.load(Student.class, 1);
		s.setAge(16);
		session.getTransaction().commit(); // 同一个session里面update

		// 以下更新全发语句进行比较
		s.setName("tiantia");
		Session session1 = sf.getCurrentSession();
		session1.beginTransaction();
		session1.merge(s);
		session1.getTransaction().commit();

	}

	@Test
	// 通过类Query更新部分更改的字段
	public void testUpdate7() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Query q = session
				.createQuery("update Student s set s.name='z5' where s.id = 1");
		q.executeUpdate();
		session.getTransaction().commit();

	}

	@Test
	public void testSaveOrUpdate() {

		Teacher t = new Teacher();
		t.setName("t4");
		t.setAddress("kunming");
		t.setAge(77);

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(t);// 发生save

		session.getTransaction().commit();

		t.setName("t5");

		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.saveOrUpdate(t);// 发生update
		session2.getTransaction().commit();

	}

	@Test
	// 清除缓存后，当再次拿teacher对象时，必须从数据库select(两次发出select语句)
	public void testClear() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher teacher = (Teacher) session.load(Teacher.class, 2);
		System.out.println(teacher.getName());
		session.clear();

		Teacher teacher1 = (Teacher) session.load(Teacher.class, 2);
		System.out.println(teacher1.getName());
		session.getTransaction().commit();
	}

	@Test
	public void testFlush() {

		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Teacher t = (Teacher) session.load(Teacher.class, 2);
		t.setName("tttt");
		session.clear();
		t.setName("ttttt");

		session.getTransaction().commit();

	}

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
