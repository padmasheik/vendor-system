package com.soa.vendorsystem.VendorProducer.jms.sender;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;

import com.soa.vendorsystem.VendorProducer.jms.controller.ProducerController;

public class MessageSender {
	private static Logger logger = LogManager.getLogger(ProducerController.class);
	@Autowired
	JmsTemplate jmsTemplate;

	@SendTo("CONSUMER.QUEUE")
	public void send(String json) {
		jmsTemplate.convertAndSend(json);
		logger.info("Message sent");

	}

}
