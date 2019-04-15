package com.inmemory.gleifparser;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	public static final String WEB_SOCKET_DELIVERY_NOTIFICATION_CHANNEL = "/xml-upload-notification-channel";
	public static final String WEB_SOCKET_DELIVERY_NOTIFICATION_MESSAGE_TOPIC = "/topic/xml-upload-progress";

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint(WEB_SOCKET_DELIVERY_NOTIFICATION_CHANNEL).withSockJS();
	}

}