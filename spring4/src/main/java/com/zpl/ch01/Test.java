package com.zpl.ch01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zpl.ch02.JavaConfig;

public class Test {
	public static void main(String[] args) {
		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext(
		// FConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class);
		UseFunctionService s = context.getBean(UseFunctionService.class);
		System.out.println(s.SayHello("  BeiJin"));
		context.close();
	}
}
