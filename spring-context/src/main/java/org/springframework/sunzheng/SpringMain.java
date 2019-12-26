package org.springframework.sunzheng;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.sunzheng.aop.HelloService;
import org.springframework.sunzheng.aop.HelloServiceImpl;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

		HelloService helloService = context.getBean(HelloServiceImpl.class);
		helloService.hello("sunzheng");

		System.out.println(helloService instanceof HelloServiceImpl);



	}
}
