package com.zpl.webSocket;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/welcome") // 通过这个链接传进来
	@SendTo("/topic/getResponse") // 通过这个链接将信息发出去
	public ZPLResponse say(ZPLMessage msg) {
		return new ZPLResponse("Welcome" + msg.getName());
	}

	@MessageMapping("/chat")
	public void handleChat(Principal principal, String msg) {
		if (principal.getName().equals("wyf")) {
			messagingTemplate.convertAndSendToUser("zpl", "/queue/notifictions",
					principal.getName() + "-send " + msg);
		} else {
			messagingTemplate.convertAndSendToUser("wyf", "/queue/notifictions",
					principal.getName() + "-send " + msg);
		}

	}

}
