package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

/**
 * 
 * @Title:Teacher
 * @Description:// @GeneratedValue �Զ���������,"teacherSEQ_DB"���浽���ݿ� ��"teacherSEQ"Ϊ����
 * @author:Administrator
 * @date:2018��1��3�� ����3:46:29
 */
@Entity
@TableGenerator(name = "teacherID", // �����õ�TABLE����
table = "teacherID_DB", // ���ݿ⽨���ı���
pkColumnName = "key_value", pkColumnValue = "pk_value", valueColumnName = "teacher", // pkColumnValue��Ӧ����
allocationSize = 1 // pkColumnValue��Ӧ����
)
@SequenceGenerator(name = "teacherSEQ", sequenceName = "teacherSEQ_DB")
public class Teacher {
	private int id;
	private String name;
	private String title;

	// @GeneratedValue id���ɲ��ԣ��൱��xml����Ĭ�ϵ�nativeһ������ͨ��
	// @GeneratedValue �Զ���������
	@Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "teacherSEQ")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "teacherID")
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
