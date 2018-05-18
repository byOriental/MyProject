package javase.cls.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @Title:SetDemo02
 * @Description:凡是实现comparable接口的类都可以进行对象排序
 * @author:Administrator
 * @date:2017年9月14日 上午11:13:07
 */

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {// 覆写Object方法
		return this.name + this.age;
	}

	public int compareTo(Person p) {// 覆写Comparable方法
		if (this.age > p.age) {
			return 1;
		} else if (this.age < p.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class SetDemo02 {

	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
		Person p1 = new Person("张三", 21);
		Person p2 = new Person("张四", 27);
		Person p3 = new Person("张苏", 20);
		Person p4 = new Person("张李", 34);
		Person p5 = new Person("张爱", 41);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		System.out.println(set);
	}

}
