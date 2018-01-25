package com.by.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_group")
public class Group {
	private int id;
	private String name;
	private Set<User> users = new HashSet<User>();

	@OneToMany
	// ��������ע��@JoinColumn(name = "group_id")������һ�Զ�ᱻ���ɶ�Զ������������ɵ����ű�[�м��]��
	@JoinColumn(name = "group_id")
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
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