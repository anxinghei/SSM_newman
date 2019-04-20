package com.itheima.mapping;

public class Person {

	private int id;
	private String name;
	private int age;
	private String sex;
	private IdCard card;
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
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public IdCard getCard() {
		return this.card;
	}
	public void setCard(IdCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person: "+id+"--"+name+"--"+age+"--"+sex+"--"+card.getId();
	}
}
