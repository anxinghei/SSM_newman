package com.itheima.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CGLIBProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
		MyAspect myAspect=new MyAspect();
		myAspect.check();
		Object object=methodProxy.invokeSuper(proxy,args);
		myAspect.log();
		return object;
	}
	
	// 代理方法
	public Object createProxy(Object target) {
		// 创建动态对象
		Enhancer enhancer=new Enhancer();
		// 确定需要增强的类，设置其父类
		enhancer.setSuperclass(target.getClass());
		// 添加回调函数
		enhancer.setCallback(this);
		// 返回创建的代理类
		return enhancer.create();
	}

}
