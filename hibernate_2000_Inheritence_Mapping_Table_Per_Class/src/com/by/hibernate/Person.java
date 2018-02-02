package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

/**
 * 
 * @Title:Person
 * @Description:�̳й�ϵӳ�䡪���������ű�
 * @author:Administrator
 * @date:2018��2��2�� ����1:35:10
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@TableGenerator(name = "t_gen", table = "t_gen_table", pkColumnName = "t_pk", valueColumnName = "t_value", pkColumnValue = "person_pk", initialValue = 1, allocationSize = 1)
public class Person {
	private int id;
	private String name;

	@Id
	@GeneratedValue(generator = "t_gen", strategy = GenerationType.TABLE)
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