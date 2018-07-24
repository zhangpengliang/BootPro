package com.zpl.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class ThymeleafApplication {

	@RequestMapping("/")
	public String index(Model modle) {
		Person single = new Person("aa", 11);
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("zhangsan", 14);
		Person p2 = new Person("lisi", 15);
		Person p3 = new Person("wangwu", 16);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		modle.addAttribute("singlePerson", single);
		modle.addAttribute("people", people);
		return "index";

	}

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

	// 添加Tomcat的Connector的配置.问题1：为什么不能添加EmbeddedServletContainerFactory

}
