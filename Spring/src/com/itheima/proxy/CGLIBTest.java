package com.itheima.proxy;

public class CGLIBTest {

	public static void main(String[] args) {
		
		CGLIBProxy proxy=new CGLIBProxy();
		User user=new UserImpl();
		// ��ȡ��ǿ���Ŀ�����
		User userDao=(User)proxy.createProxy(user);
		userDao.addUser();
	}
}
