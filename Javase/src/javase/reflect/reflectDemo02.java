package javase.reflect;

/**
 * ͨ��Class��Constructorʵ��������
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
		return "������" + this.name + "���䣺" + this.age;
	}
}

public class reflectDemo02 {

	public static void main(String[] args) {
		// ʵ����Class����
		Class<?> cls = null;
		try {
			cls = Class.forName("javase.reflect.Person");// ������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// ��ȡ���캯������,��ʵ����
		Person ps = null;
		Constructor<?> cstr[] = null;
		cstr = cls.getConstructors();// ��ȡConstructor����
		try {
			ps = (Person) cstr[0].newInstance("�ٶ�", 15);// �ɱ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ps);
	}
}
