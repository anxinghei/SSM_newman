package com.itheima.Parameters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {

	@RequestMapping("/tofindOrdersWithUser")
	public String tofindOrdersWithUser() {
		return "orders";
	}
	@RequestMapping("/findOrdersWithUser")
	public String findOrdersWithUser(Orders orders) {
		int ordersId=orders.getOrdersId();
		User user=orders.getUser();
		String username=user.getUsername();
		System.out.println(ordersId+"---"+username);
		return "success";
	}
}
