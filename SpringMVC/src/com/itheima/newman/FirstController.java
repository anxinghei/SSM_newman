package com.itheima.newman;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("msg", "���ǵ�һ��springmvc����");
		modelAndView.setViewName("WEB-INF/jsp/first.jsp");
		return modelAndView;
	}

}
