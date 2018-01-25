package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @Title:User
 * @Description:manyToOne多对一一个用户属于一个用户组，一个用户组包含多个用户.
 * @author:Administrator
 * @date:2018年1月17日 下午1:06:11
 */
@Table(name = "t_user")
@Entity
public class User {
	private int id;
	private String name;
	private Group group;

	// 在多方加外键指向一方
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
