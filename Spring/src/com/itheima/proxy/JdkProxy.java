package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

	// ����Ŀ����ӿ�
	private User user;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			
		MyAspect aspect=new MyAspect();
		aspect.check();
		Object obj=method.invoke(user, args);
		aspect.log();
		
		return obj;
	}
	
	// ����������
	public Object createProxy(User user) {
		this.user=user;
		ClassLoader loader=JdkProxy.class.getClassLoader();
		// ���������ʵ�ֵ����нӿ�
		Class[] clazz=user.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, clazz, this);
	}
}
