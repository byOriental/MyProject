package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @Title:User
 * @Description:manyToOne���һһ���û�����һ���û��飬һ���û����������û�.
 * @author:Administrator
 * @date:2018��1��17�� ����1:06:11
 */
// ���ﱻ�Զ�����������t_teacher��t_student
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
