package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * 
 * @Title:Wife
 * @Description:联合主键
 * @author:Administrator
 * @date:2018年1月16日 下午3:17:38
 */
@Entity
@IdClass(WifePK.class)
public class Wife {
	private int id;
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

}
