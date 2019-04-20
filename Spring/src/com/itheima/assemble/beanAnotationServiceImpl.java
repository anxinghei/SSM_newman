package com.itheima.assemble;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("beanAnotationService")
public class beanAnotationServiceImpl implements beanAnotationService{
	@Resource(name="beanAnotation")
	private beanAnotation beanAnotation;
	@Override
	public void save() {
			
		this.beanAnotation.save();
		System.out.println("---beanAnotationService---Save");
	}

}
