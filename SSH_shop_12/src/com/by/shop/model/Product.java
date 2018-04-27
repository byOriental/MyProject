package com.by.shop.model;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
@Table(name = "product")
public class Product implements java.io.Serializable {

	// Fields

	private Integer id;
	private Category category;
	private String name;
	private Double price;
	private String pic;
	private String remark;// 商品简单介绍
	private String xremark;// 商品详细介绍
	private Date date;// 生产日期
	private Boolean commend;// 是否为推荐商品，推荐商品可以显示首页
	private Boolean open;// 是否为有效商品，有效商品显示首页

	// Constructors

	/** default constructor */
	public Product() {
	}

	//
	// /** minimal constructor */
	// public Product(Date date) {
	// this.date = date;
	// }

	/** full constructor */
	public Product(Category category, String name, Double price, String pic,
			String remark, String xremark, Date date, Boolean commend,
			Boolean open) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.xremark = xremark;
		this.date = date;
		this.commend = commend;
		this.open = open;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cid")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getXremark() {
		return this.xremark;
	}

	public void setXremark(String xremark) {
		this.xremark = xremark;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getCommend() {
		return this.commend;
	}

	public void setCommend(Boolean commend) {
		this.commend = commend;
	}

	public Boolean getOpen() {
		return this.open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

}