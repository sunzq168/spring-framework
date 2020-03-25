package org.springframework.sunzheng;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.sunzheng.ioc.Sunzheng;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Sunzheng bd = (Sunzheng) beanFactory.getBean("sunzheng");
		System.out.println(bd.getName());


	}
}
