package com.itheima.Anotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value="/hello")
public class FirstController {

	@RequestMapping(value="/firstController")
	public String handleRequest(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception {
		
		model.addAttribute("msg", "这是第一个springmvc程序！---注解形式开发");
		
		return "first";
	}

}
