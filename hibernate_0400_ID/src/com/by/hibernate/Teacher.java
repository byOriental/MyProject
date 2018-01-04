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
 * @Description:// @GeneratedValue 自定义生成器,"teacherSEQ_DB"将存到数据库 ，"teacherSEQ"为引用
 * @author:Administrator
 * @date:2018年1月3日 下午3:46:29
 */
@Entity
@TableGenerator(name = "teacherID", // 被调用的TABLE名字
table = "teacherID_DB", // 数据库建立的表名
pkColumnName = "key_value", pkColumnValue = "pk_value", valueColumnName = "teacher", // pkColumnValue对应类名
allocationSize = 1 // pkColumnValue对应类名
)
@SequenceGenerator(name = "teacherSEQ", sequenceName = "teacherSEQ_DB")
public class Teacher {
	private int id;
	private String name;
	private String title;

	// @GeneratedValue id生成策略，相当与xml配置默认的native一样（普通）
	// @GeneratedValue 自定义生成器
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
