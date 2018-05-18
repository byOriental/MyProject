package javase.reflect;

/**
 * 通过Class、Constructor实例化对象
 */
import java.lang.reflect.Constructor;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "姓名：" + this.name + "年龄：" + this.age;
	}
}

public class reflectDemo02 {

	public static void main(String[] args) {
		// 实例化Class对象
		Class<?> cls = null;
		try {
			cls = Class.forName("javase.reflect.Person");// 加载类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 获取构造函数数组,并实例化
		Person ps = null;
		Constructor<?> cstr[] = null;
		cstr = cls.getConstructors();// 获取Constructor数组
		try {
			ps = (Person) cstr[0].newInstance("百度", 15);// 可变参数
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ps);
	}
}
