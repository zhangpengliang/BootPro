package com.zpl.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpl.spring_boot_starter_hello.HelloService;

@RestController
@SpringBootApplication
public class BootApplication {

	@Autowired
	private HelloService h;

	@RequestMapping("/hello")
	public String sayHello() {
		return h.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
