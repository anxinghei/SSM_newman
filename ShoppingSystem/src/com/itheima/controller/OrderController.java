package com.itheima.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
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

// 添加订单
	@RequestMapping("/addOrder.action")
	public String addOrder(Order order) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String currentDate = dateFormat.format(new Date());
		order.setDate(currentDate);
		orderService.addOrder(order);
		return "success";
	}

// 删除订单
	@RequestMapping("/deleteOrder.action")
	public String deleteOrder(int id, Model model) {
		Order order = new Order();
		order.setId(id);
		List<Order> orders = orderService.queryOrder(order);
		if (orders.isEmpty()) {
			model.addAttribute("delete", "找不到该订单，请重新输入！");
			System.out.println("+++");
			return "order";
		} else {
			orderService.deleteOrder(id);
			model.addAttribute("delete", "订单已删除！");
			return "order";
		}
	}

// 更新订单
	@RequestMapping("/updateOrder.action")
	public String updateOrder(String id, String name, String price, String day, String userid, Model model) {
		Order order = new Order();
		if (!id.isEmpty()) {
			order.setId(Integer.parseInt(id));
		}else {
			model.addAttribute("update", "未对订单进行修改，请重新输入！");
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
			model.addAttribute("update", "未对订单进行修改，请重新输入！");
			return "order";
		}else {
			orderService.updateOrder(order);
			return "success";
		}
	}

// 查找订单
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
			model.addAttribute("query", "找不到该订单，请重新输入！");
			System.out.println("---");
			return "order";
		} else {
			model.addAttribute("query", "");
			for (Order order2 : orders)
				System.out.println(order2);
			return "success";
		}
	}
	
	@RequestMapping(value="/findAll.action",method=RequestMethod.GET)
	public String findAll(@RequestParam(name="pageNum",defaultValue="1")int page,
			@RequestParam(name="pageSize",defaultValue="10")int size,Model mView) {
		List<Order> orders=orderService.findAll(page, size);
		for(Order order:orders)
			System.out.println(order);
		PageInfo<Order> pageInfo=new PageInfo<Order>(orders);
		mView.addAttribute("orders",orders);
		mView.addAttribute("pageInfo",pageInfo);
		return "list";
	}
	
}
