package com.itheima.proxy;

public class JdkTest {

	public static void main(String[] args) {
			
		JdkProxy jdkProxy=new JdkProxy();
		User user=new UserImpl();
		// 从代理对象中获得增强后的目标对象
		User userDao=(User)jdkProxy.createProxy(user);
		userDao.addUser();
	}

}
