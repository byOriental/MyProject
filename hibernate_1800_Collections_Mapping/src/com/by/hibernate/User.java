package com.by.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @Title:User
 * @Description:
 * @author:Administrator
 * @date:2018年1月17日 下午1:06:11
 */
@Entity
@Table(name = "t_user")
public class User {
	private int id;
	private String name;
	private Group group;

	// 及联
	// many 默认为eager,自动关联many。一般使用它们的默认值fetch配置就满足需求
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
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
