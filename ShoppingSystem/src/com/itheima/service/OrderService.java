package com.itheima.service;

import java.util.List;

import com.itheima.po.Order;

public interface OrderService {

	public void addOrder(Order order);
	
	public void deleteOrder(int id);
	
	public void updateOrder(Order order);
	
	public List<Order> queryOrder(Order order);
}
