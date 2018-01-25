package com.by.hibernate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @Title:Husband
 * @Description:������������
 * @author:Administrator
 * @date:2018��1��15�� ����4:56:21
 */
@Entity
public class Husband {
	private int id;
	private String name;
	private Wife wife;// �ɷ�ָ������

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Ƕ���
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
