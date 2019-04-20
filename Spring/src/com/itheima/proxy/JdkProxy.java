package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

	// 声明目标类接口
	private User user;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			
		MyAspect aspect=new MyAspect();
		aspect.check();
		Object obj=method.invoke(user, args);
		aspect.log();
		
		return obj;
	}
	
	// 创建代理方法
	public Object createProxy(User user) {
		this.user=user;
		ClassLoader loader=JdkProxy.class.getClassLoader();
		// 被代理对象实现的所有接口
		Class[] clazz=user.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, clazz, this);
	}
}
