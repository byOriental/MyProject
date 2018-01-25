package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @Title:User
 * @Description:manyToOne多对一一个用户属于一个用户组，一个用户组包含多个用户.
 * @author:Administrator
 * @date:2018年1月17日 下午1:06:11
 */
// 这里被自动创建表名：t_teacher和t_student
@Entity
public class Student {
	private int id;
	private String name;

	@Id
	@GeneratedValue
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
}
