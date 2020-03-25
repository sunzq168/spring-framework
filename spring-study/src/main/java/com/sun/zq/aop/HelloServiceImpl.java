package com.sun.zq.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
	public void hello(String name) {
		System.out.println("hello:" + name);
	}
}
