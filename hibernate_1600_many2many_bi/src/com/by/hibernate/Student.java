package com.by.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @Title:User
 * @Description:manyToOne���һһ���û�����һ���û��飬һ���û����������û�.
 * @author:Administrator
 * @date:2018��1��17�� ����1:06:11
 */
@Entity
public class Student {
	private int id;
	private String name;
	private Set<Teacher> teachers = new HashSet<Teacher>();

	// ��ʦ����ѧ������ӵ�з���������ɾ����
	// ����д����many-to-manyʱ����mappedBy = "students"ָ������һ��д����Ϊ���ط�
	@ManyToMany(mappedBy = "students")
	// @JoinTable(name = "t_s", joinColumns = { @JoinColumn(name = "student_id")
	// }, inverseJoinColumns = { @JoinColumn(name = "teacher_id") })
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
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
