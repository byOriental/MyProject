package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @Title:Person
 * @Description:�̳й�ϵӳ�䡪���������ű�����student��teacher�������ָ��Person��Person���¼����id�Լ��������
 * @author:Administrator
 * @date:2018��2��2�� ����2:24:59
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
