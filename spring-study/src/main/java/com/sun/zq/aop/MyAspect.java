package com.sun.zq.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.sun.zq..*.*(..))")
	public void pointCut(){

	}

	// advice在pointCut之前执行
	@Before("com.sun.zq.aop.MyAspect.pointCut()")
	public void advice() {
		System.out.println("before......");
	}
}
