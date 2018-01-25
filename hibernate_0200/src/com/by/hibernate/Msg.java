package com.by.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @Title:Msg
 * @Description:many(msg)-to-one(topic)
 * @author:Administrator
 * @date:2018年1月24日 下午1:41:01
 */
@Entity
public class Msg {
	private int id;
	private String cont;
	private Topic topic;

	@ManyToOne
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

}
