package com.zpl.ch01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	FunctionService service;

	public void setService(FunctionService service) {
		this.service = service;
	}

	public String SayHello(String word) {
		return service.sayHello(word);
	}
}
