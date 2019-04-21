package com.itheima.service;

import com.itheima.po.User;

public interface UserService {

	public User findUserByName(String username);
	
	public void addUser(User user);
	
}
