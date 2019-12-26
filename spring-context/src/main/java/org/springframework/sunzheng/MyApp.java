package org.springframework.sunzheng;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("org.springframework.sunzheng")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyApp {

}
