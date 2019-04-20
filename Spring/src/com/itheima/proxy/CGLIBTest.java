package com.itheima.proxy;

public class CGLIBTest {

	public static void main(String[] args) {
		
		CGLIBProxy proxy=new CGLIBProxy();
		User user=new UserImpl();
		// 获取增强后的目标对象
		User userDao=(User)proxy.createProxy(user);
		userDao.addUser();
	}
}
