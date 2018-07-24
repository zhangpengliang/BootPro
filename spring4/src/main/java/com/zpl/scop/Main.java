package com.zpl.scop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaScopeConfig.class);
		DemoSingleService single = context.getBean(DemoSingleService.class);
		DemoSingleService single2 = context.getBean(DemoSingleService.class);

		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

		if (single == single2) {
			System.out.println("单例----同一个");
		}
		if (p1 == p2) {
			System.out.println("多例--相同");
		} else {
			System.out.println("多例--不同");
		}
		context.close();
	}
}
