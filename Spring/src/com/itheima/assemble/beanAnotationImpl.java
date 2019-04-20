package com.itheima.assemble;

import org.springframework.stereotype.Repository;

@Repository("beanAnotation")
public class beanAnotationImpl implements beanAnotation{

	@Override
	public void save() {
		
		System.out.println("beanAnotation---Save");
	}

}
