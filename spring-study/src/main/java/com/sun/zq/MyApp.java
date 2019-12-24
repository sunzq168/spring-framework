package com.sun.zq;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.sun.zq")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyApp {

}
