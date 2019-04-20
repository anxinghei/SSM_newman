package com.itheima.jdbc;

import java.util.List;

public interface UserDao {

	public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(int id);
	
	public User findUser(int id);
	
	public List<User> findAllUser();
}
