package com.by.shop.model;

public class Category {
	private int id;
	private String type;
	private boolean hot;

	// 必须保留一个无参数的构造方法
	public Category() {

	};

	public Category(int id, String type, boolean hot) {
		this.id = id;
		this.type = type;
		this.hot = hot;
	}

	public Category(String string, boolean b) {
		this.type = type;
		this.hot = hot;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

}
