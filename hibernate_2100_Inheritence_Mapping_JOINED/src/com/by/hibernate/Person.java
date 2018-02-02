package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @Title:Person
 * @Description:继承关系映射——生成三张表。其中student、teacher的外键都指向Person。Person表记录对象id以及具体对象
 * @author:Administrator
 * @date:2018年2月2日 下午2:24:59
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
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
