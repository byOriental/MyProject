package com.by.hibernate;

/**
 * 
 * @Title:Student
 * @Description:��������
 * @author:Administrator
 * @date:2018��1��3�� ����8:28:17
 */
public class Student {
	private StudentPK pk;
	private int age;

	// private String id;//ʹ��uuidʱ���ֶ����ͱ���ΪString

	public int getAge() {
		return age;
	}

	public StudentPK getPk() {
		return pk;
	}

	public void setPk(StudentPK pk) {
		this.pk = pk;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
