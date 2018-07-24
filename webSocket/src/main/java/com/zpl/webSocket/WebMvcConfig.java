package com.zpl.webSocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	// 我们访问的是/ws。跳转的页面时zpl

	/**
	 * 快捷的viewController配置，用于无任何业务处理的简单跳转
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/ws").setViewName("/zpl");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/chat").setViewName("/chat");
	}
}
