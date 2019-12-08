package com.sun.zq;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements  BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("cityService".equals(beanName)) {
			System.out.println("cityService before");
		}
		bean.getClass().getInterfaces();

		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("cityService".equals(beanName)) {
			System.out.println("cityService after");
		}
		return bean;
	}
}
