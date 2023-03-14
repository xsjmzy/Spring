package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.aop.service","com.aop.msg"})
/*注意：@ComponentScan(一个参数)  @ComponentScan({参数1，参数2})*/
@EnableAspectJAutoProxy
public class AppConfig {

}
