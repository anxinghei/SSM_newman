package com.itheima.po;

public class Order {

	private int id;
	private String name;
	private int price;
	private String day;
	private int userid;
	
	public int getUserid() {
		return this.userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return this.day;
	}
	public void setDate(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Order [id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", day=" + this.day
				+ ", userid=" + this.userid + "]";
	}
	
}