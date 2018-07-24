package com.zpl.webSocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * 
 * @author zhangpengliang
 *
 * @EnableWebSocketMessageBroker 开启STOMP协议来传输基于代理的消息这时支持 @messageMapping。
 *
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {

		registry.addEndpoint("/endpointZPL").withSockJS();// 注册STOMP协议的节点，并映射指定的URL.并指定协议为SockJS
		registry.addEndpoint("/endpointChat").withSockJS();

	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/queue", "/topic");// 广播式配置一个/topic的消息代理./queue是点对点的

	}

}
