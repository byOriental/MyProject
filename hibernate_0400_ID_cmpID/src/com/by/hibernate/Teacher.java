package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TeacherPK.class)
public class Teacher {
	// private TeacherPK pk;

	private int id;
	private String name;
	private int age;
	private String address;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @EmbeddedId
	// public TeacherPK getPk() {
	// return pk;
	// }
	//
	// public void setPk(TeacherPK pk) {
	// this.pk = pk;
	// }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
