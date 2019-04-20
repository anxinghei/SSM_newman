package com.itheima.mapping;

public class IdCard {

	private int id;
	private String code;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Card: "+id+"--"+code;
	}
}
