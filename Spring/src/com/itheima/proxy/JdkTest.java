package com.itheima.proxy;

public class JdkTest {

	public static void main(String[] args) {
			
		JdkProxy jdkProxy=new JdkProxy();
		User user=new UserImpl();
		// �Ӵ�������л����ǿ���Ŀ�����
		User userDao=(User)jdkProxy.createProxy(user);
		userDao.addUser();
	}

}
