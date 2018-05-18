package com.by.hibernate;

/**
 * 
 * @Title:Student
 * @Description:联合主键
 * @author:Administrator
 * @date:2018年1月3日 下午8:28:17
 */
public class Student {
	private StudentPK pk;
	private int age;

	// private String id;//使用uuid时，字段类型必须为String

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
