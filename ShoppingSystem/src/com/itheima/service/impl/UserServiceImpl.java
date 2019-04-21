package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.UserDao;
import com.itheima.po.User;
import com.itheima.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUserByName(String username) {
		return userDao.findUserByName(username);
	}
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

}
