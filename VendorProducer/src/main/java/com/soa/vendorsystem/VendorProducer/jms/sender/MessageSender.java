package com.soa.vendorsystem.VendorProducer.jms.sender;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	private static Logger logger = LogManager.getLogger(MessageSender.class);
	@Autowired
	JmsTemplate jmsTemplate;

	// @SendTo("CONSUMER.QUEUE")
	public String send(String json) {
		jmsTemplate.convertAndSend("CONSUMER.QUEUE", json);
		logger.info("Message sent");
		return json;

	}

}
