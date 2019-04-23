package com.itheima.dao;

import java.util.List;

import com.itheima.po.Order;

public interface OrderDao {

	public void addOrder(Order order);

	public void deleteOrder(int id);
	
	public void updateOrder(Order order);
	
	public List<Order> queryOrder(Order order);
	
	public List<Order> findAll();
}
