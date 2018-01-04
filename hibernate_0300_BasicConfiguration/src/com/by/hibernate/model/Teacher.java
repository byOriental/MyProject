package com.by.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "_Teacher")
// 指定表明（自定义）
@Entity
public class Teacher {
	private int id;
	private String name;
	private String title;
	private String mySweetHeart;
	private Date birDate;
	private ZhiChen zhichen;

	// 枚举类型
	@Enumerated(EnumType.STRING)
	public ZhiChen getZhichen() {
		return zhichen;
	}

	public void setZhichen(ZhiChen zhichen) {
		this.zhichen = zhichen;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirDate() {
		return birDate;
	}

	public void setBirDate(Date birDate) {
		this.birDate = birDate;
	}

	// @Transient(“透明”，不存进去)
	public String getMySweetHeart() {
		return mySweetHeart;
	}

	public void setMySweetHeart(String mySweetHeart) {
		this.mySweetHeart = mySweetHeart;
	}

	// 指定@id主键，其他属性默认映射
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 指定字段名（字段名和属性名不同时）
	@Column(name = "_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
