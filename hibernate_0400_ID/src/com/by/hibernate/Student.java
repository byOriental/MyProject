package com.by.hibernate;

public class Student {
	private int id;
	private String name;
	private int age;

	// private String id;//ʹ��uuidʱ���ֶ����ͱ���ΪString
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
