package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @Title:User
 * @Description:manyToOne���һһ���û�����һ���û��飬һ���û����������û�.
 * @author:Administrator
 * @date:2018��1��17�� ����1:06:11
 */
@Table(name = "t_user")
@Entity
public class User {
	private int id;
	private String name;
	private Group group;

	// �ڶ෽�����ָ��һ��
	@ManyToOne
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

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
