package com.itheima.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;

public class MyAspect implements org.aopalliance.intercept.MethodInterceptor{

	public void check() {
		System.out.println("---���Ȩ��");
	}
	public void log() {
		System.out.println("---��¼��־");
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		check();
		// ִ��Ŀ�귽��
		Object object=mi.proceed();
		log();
		return object;
	}
}
