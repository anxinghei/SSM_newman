package com.itheima.assemble;

import java.util.List;

public class beanXml {
	
	private String username;
	private String password;
	private List<String> list;
	// 1.使用构造注入
	// 提供带所有参数的构造方法
	public beanXml(String username, String password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}
	// 2.使用设值注入
	// 提供无参构造方法、所有属性的setter方法
	public beanXml() {
		super();
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "User [username=" + this.username + ", password=" + this.password + ", list=" + this.list + "]";
	}
	
	
}
