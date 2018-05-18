package javase.cls.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @Title:SetDemo02
 * @Description:����ʵ��comparable�ӿڵ��඼���Խ��ж�������
 * @author:Administrator
 * @date:2017��9��14�� ����11:13:07
 */

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {// ��дObject����
		return this.name + this.age;
	}

	public int compareTo(Person p) {// ��дComparable����
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
		Person p1 = new Person("����", 21);
		Person p2 = new Person("����", 27);
		Person p3 = new Person("����", 20);
		Person p4 = new Person("����", 34);
		Person p5 = new Person("�Ű�", 41);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		System.out.println(set);
	}

}
