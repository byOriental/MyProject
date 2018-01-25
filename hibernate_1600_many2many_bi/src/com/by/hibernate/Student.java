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
 * @Description:manyToOne多对一一个用户属于一个用户组，一个用户组包含多个用户.
 * @author:Administrator
 * @date:2018年1月17日 下午1:06:11
 */
@Entity
public class Student {
	private int id;
	private String name;
	private Set<Teacher> teachers = new HashSet<Teacher>();

	// 老师管理学生（被拥有方），不能删除。
	// 两种写法，many-to-many时可用mappedBy = "students"指定，另一种写两边为主控方
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
