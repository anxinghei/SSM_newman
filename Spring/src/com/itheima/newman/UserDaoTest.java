package com.itheima.newman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

	public static void main(String[] args) {
		// ��ʼ�����������������ļ�
		String string="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		// ��ȡʵ���������÷���
		UserDao userDao=(UserDao)applicationContext.getBean("UserDao");
		userDao.say();
	}

}
