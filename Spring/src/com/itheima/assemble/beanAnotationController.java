package com.itheima.assemble;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("beanAnotationController")
public class beanAnotationController {
	@Resource(name="beanAnotationService")
	private beanAnotationService beanAnotationService;
	public void save() {
		this.beanAnotationService.save();
		System.out.println("------beanAnotation---Save");
	}
}
