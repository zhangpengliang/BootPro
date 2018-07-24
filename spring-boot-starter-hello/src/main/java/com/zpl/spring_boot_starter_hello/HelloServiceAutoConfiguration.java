package com.zpl.spring_boot_starter_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
public class HelloServiceAutoConfiguration {

	@Autowired
	private HelloServiceProperties pro;

	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService() {
		HelloService s = new HelloService();
		s.setMsg(pro.getMsg());
		return s;
	}

}
