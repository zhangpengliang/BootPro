package com.zpl.spring_boot_starter_hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(
				HelloServiceAutoConfiguration.class);
		HelloService s = c.getBean(HelloService.class);
		s.sayHello();
		System.out.println(s.sayHello());
	}
}
