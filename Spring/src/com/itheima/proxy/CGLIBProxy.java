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
	
	// ������
	public Object createProxy(Object target) {
		// ������̬����
		Enhancer enhancer=new Enhancer();
		// ȷ����Ҫ��ǿ���࣬�����丸��
		enhancer.setSuperclass(target.getClass());
		// ��ӻص�����
		enhancer.setCallback(this);
		// ���ش����Ĵ�����
		return enhancer.create();
	}

}
