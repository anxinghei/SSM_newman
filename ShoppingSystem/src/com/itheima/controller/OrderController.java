package com.itheima.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.po.Order;
import com.itheima.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping("/toall")
	public String toAll() {
		return "order";
	}

// ��Ӷ���
	@RequestMapping("/addOrder.action")
	public String addOrder(Order order) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String currentDate = dateFormat.format(new Date());
		order.setDate(currentDate);
		orderService.addOrder(order);
		return "success";
	}

// ɾ������
	@RequestMapping("/deleteOrder.action")
	public String deleteOrder(int id, Model model) {
		Order order = new Order();
		order.setId(id);
		List<Order> orders = orderService.queryOrder(order);
		if (orders.isEmpty()) {
			model.addAttribute("delete", "�Ҳ����ö��������������룡");
			System.out.println("+++");
			return "order";
		} else {
			orderService.deleteOrder(id);
			model.addAttribute("delete", "������ɾ����");
			return "order";
		}
	}

// ���¶���
	@RequestMapping("/updateOrder.action")
	public String updateOrder(String id, String name, String price, String day, String userid, Model model) {
		Order order = new Order();
		if (!id.isEmpty()) {
			order.setId(Integer.parseInt(id));
		}else {
			model.addAttribute("update", "δ�Զ��������޸ģ����������룡");
			return "order";
		}
		if (!name.isEmpty())
			order.setName(name);
		if (!price.isEmpty())
			order.setPrice(Integer.parseInt(price));
		if (!day.isEmpty())
			order.setDate(day);
		if (!userid.isEmpty())
			order.setUserid(Integer.parseInt(userid));
		if(name.isEmpty() && price.isEmpty() && day.isEmpty() && userid.isEmpty()) {
			model.addAttribute("update", "δ�Զ��������޸ģ����������룡");
			return "order";
		}else {
			orderService.updateOrder(order);
			return "success";
		}
	}

// ���Ҷ���
	@RequestMapping("/queryOrder.action")
	public String queryOrder(String id, String name, String price, String day, String userid, Model model) {
		Order order = new Order();
		if (!id.isEmpty())
			order.setId(Integer.parseInt(id));
		if (!name.isEmpty())
			order.setName(name);
		if (!price.isEmpty())
			order.setPrice(Integer.parseInt(price));
		if (!day.isEmpty())
			order.setDate(day);
		if (!userid.isEmpty())
			order.setUserid(Integer.parseInt(userid));
		List<Order> orders = orderService.queryOrder(order);
		if (orders.isEmpty()) {
			model.addAttribute("query", "�Ҳ����ö��������������룡");
			System.out.println("---");
			return "order";
		} else {
			model.addAttribute("query", "");
			for (Order order2 : orders)
				System.out.println(order2);
			return "success";
		}
	}
}
