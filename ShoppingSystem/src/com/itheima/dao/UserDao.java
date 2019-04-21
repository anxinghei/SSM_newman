package com.itheima.dao;

import com.itheima.po.User;

public interface UserDao {

	public User findUserByName(String name);
	
	public void addUser(User user );
	
}
