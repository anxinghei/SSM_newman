package as;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectAnotation {
	
	@Pointcut("execution(* as.*.*(..))")
	private void myPointCut() {}
	
	@Before("myPointCut()")
	private void myBefore(JoinPoint joinPoint) {
		System.out.println("---前置通知    11111111111111111");
	}
	
	@After("myPointCut()")
	private void myAfter() {
		System.out.println("---最终通知    11111111111111111");
	}
}
