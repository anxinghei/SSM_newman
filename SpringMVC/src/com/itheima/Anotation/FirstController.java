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
		
		model.addAttribute("msg", "���ǵ�һ��springmvc����---ע����ʽ����");
		
		return "first";
	}

}
