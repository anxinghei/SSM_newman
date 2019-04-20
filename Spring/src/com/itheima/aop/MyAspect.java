package com.itheima.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;

public class MyAspect implements org.aopalliance.intercept.MethodInterceptor{

	public void check() {
		System.out.println("---检查权限");
	}
	public void log() {
		System.out.println("---记录日志");
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		check();
		// 执行目标方法
		Object object=mi.proceed();
		log();
		return object;
	}
}
