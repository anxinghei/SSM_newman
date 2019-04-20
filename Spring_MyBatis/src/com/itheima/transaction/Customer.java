package com.itheima.transaction;

import org.apache.logging.log4j.util.StringBuilderFormattable;

public class Customer {

	private int id;
	private String username;
	private String jobs;
	private String phone;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJobs() {
		return this.jobs;
	}
	public void setJobs(String jobs) {
		this.jobs = jobs;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + this.id + ", username=" + this.username + ", jobs=" + this.jobs + ", phone="
				+ this.phone + "]";
	}
	
}
