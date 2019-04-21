package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.OrderDao;
import com.itheima.po.Order;
import com.itheima.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderdao;
	
	@Override
	public void addOrder(Order order) {
		orderdao.addOrder(order);
	}
	
	@Override
	public void deleteOrder(int id) {
		orderdao.deleteOrder(id);
	}
	
	@Override
	public List<Order> queryOrder(Order order) {
		return orderdao.queryOrder(order);
	}
	
	@Override
	public void updateOrder(Order order) {
		orderdao.updateOrder(order);
	}
}
