package com.sun.zq;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CityService implements InitializingBean {
	public CityService() {
		System.out.println("cityService init");
	}

	public void say() {
		System.out.println("hello cityService");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("after InitializingBean");
	}
}
