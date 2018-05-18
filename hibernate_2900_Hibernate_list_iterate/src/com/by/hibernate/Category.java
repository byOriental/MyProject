package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.BatchSize;

/**
 * 
 * @Title:Category
 * @Description:Category板块
 * @author:Administrator
 * @date:2018年3月8日 上午10:44:05
 */
@Entity
@BatchSize(size = 5)
public class Category {
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
