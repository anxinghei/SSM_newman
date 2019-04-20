package com.itheima.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void myBefore(JoinPoint joinPoint) {
		System.out.print("--ǰ��֪ͨ��");
		System.out.print("Ŀ��������"+joinPoint.getTarget());
		System.out.println(",����ǿ��Ŀ�귽��"+joinPoint.getSignature().getName());
	}
	
	// ����֪ͨ
	public void myAfterRuturning(JoinPoint joinPoint,Object ret) {
		System.out.println("--����֪ͨ��"+ret);
	}
	
	public Object myAround(ProceedingJoinPoint point)  throws Throwable{
		System.out.println("-���ƿ�ʼ");
		Object object=point.proceed();
		System.out.println("-���ƽ���");
		return object;
	}
	
	public void myThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("--�쳣֪ͨ��"+e.getMessage());
	}
	
	// ����֪ͨ
	public void myAfter() {
		System.out.println("--����֪ͨ");
	}
}
