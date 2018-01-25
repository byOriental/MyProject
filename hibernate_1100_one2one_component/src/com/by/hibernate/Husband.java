package com.by.hibernate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @Title:Husband
 * @Description:单向联合主键
 * @author:Administrator
 * @date:2018年1月15日 下午4:56:21
 */
@Entity
public class Husband {
	private int id;
	private String name;
	private Wife wife;// 丈夫指向妻子

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// 嵌入的
	@Embedded
	public Wife getWife() {
		return wife;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

}
