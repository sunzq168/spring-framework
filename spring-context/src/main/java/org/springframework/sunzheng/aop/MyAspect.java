package org.springframework.sunzheng.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* org.springframework.sunzheng..*.*(..))")
	public void pointCut(){
		System.out.println("point cut execute");
	}

//	@Pointcut("execution(* com.sun.zq.aop..*.*(..))")
//	public void pointCutAfter(){
//		System.out.println("point cut execute");
//	}

	// advice在pointCut之前执行
	@Before("pointCut()")
	public void advice() {
		System.out.println("before......");
	}

	// advice在pointCut之前执行
//	@After("pointCutAfter()")
//	public void adviceAfter() {
//		System.out.println("after......");
//	}
}
