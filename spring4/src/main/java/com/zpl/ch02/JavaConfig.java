package com.zpl.ch02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zpl.ch01.FunctionService;
import com.zpl.ch01.UseFunctionService;

@Configuration
public class JavaConfig {

	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService u = new UseFunctionService();
		u.setService(functionService());
		return u;

	}

}
