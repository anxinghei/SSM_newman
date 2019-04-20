package com.itheima.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void myBefore(JoinPoint joinPoint) {
		System.out.print("--前置通知：");
		System.out.print("目标类型是"+joinPoint.getTarget());
		System.out.println(",被增强的目标方法"+joinPoint.getSignature().getName());
	}
	
	// 后置通知
	public void myAfterRuturning(JoinPoint joinPoint,Object ret) {
		System.out.println("--后置通知："+ret);
	}
	
	public Object myAround(ProceedingJoinPoint point)  throws Throwable{
		System.out.println("-环绕开始");
		Object object=point.proceed();
		System.out.println("-环绕结束");
		return object;
	}
	
	public void myThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("--异常通知："+e.getMessage());
	}
	
	// 最终通知
	public void myAfter() {
		System.out.println("--最终通知");
	}
}
