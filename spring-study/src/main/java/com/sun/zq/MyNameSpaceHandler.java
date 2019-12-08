package com.sun.zq;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.xml.NamespaceHandler;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class MyNameSpaceHandler implements NamespaceHandler {
	public void init() {

	}

	public BeanDefinition parse(Element element, ParserContext parserContext) {
		return null;
	}

	public BeanDefinitionHolder decorate(Node node, BeanDefinitionHolder beanDefinitionHolder, ParserContext parserContext) {
		return null;
	}
}
