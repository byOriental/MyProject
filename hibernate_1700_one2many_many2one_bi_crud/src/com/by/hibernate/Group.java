package com.by.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_group")
public class Group {
	private int id;
	private String name;
	private Set<User> users = new HashSet<User>();

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

	// one 默认为lazy,不会自动关联many，需要加fetch属性职位eager
	// 双向关联时，manyToone没有定义mappedBy。定义mappedBy会被指向。
	@OneToMany(mappedBy = "group", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	// mappedBy设置在one方（指向many）,操作数据先后顺序为先many后one
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}