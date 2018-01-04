package com.by.hibernate.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @Title:TeacherTest
 * @Description:这是一个测试类
 * @author:Administrator
 * @date:2018年1月2日 下午11:40:19
 */
public class TeacherTest {
	private static SessionFactory sf = null;

	@BeforeClass
	public static void beforeClass() {// 优先加载（也可以用静态代码块）,优化，提升执行速度
		// 配置文件类名书写不正确，不报异常时的处理办法二
		// try {
		// sf = new Configuration().configure().buildSessionFactory();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Test
	public void testTeacherSave() {
		Teacher t = new Teacher();
		t.setId(7);
		t.setName("t1");
		t.setTitle("annotation method");
		t.setMySweetHeart("xh");
		t.setBirDate(new Date());
		t.setZhichen(ZhiChen.B);

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	// 配置文件类名书写不正确，不报异常时的处理办法一
	// public static void main(String args[]) {
	// beforeClass();
	// }

	@AfterClass
	public static void afterClass() {
		sf.close();
	}

}
