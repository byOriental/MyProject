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
// ָ���������Զ��壩
@Entity
public class Teacher {
	private int id;
	private String name;
	private String title;
	private String mySweetHeart;
	private Date birDate;
	private ZhiChen zhichen;

	// ö������
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

	// @Transient(��͸�����������ȥ)
	public String getMySweetHeart() {
		return mySweetHeart;
	}

	public void setMySweetHeart(String mySweetHeart) {
		this.mySweetHeart = mySweetHeart;
	}

	// ָ��@id��������������Ĭ��ӳ��
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ָ���ֶ������ֶ�������������ͬʱ��
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
