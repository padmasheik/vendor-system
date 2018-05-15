package com.soa.vendorsystem.VendorProducer.jms.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soa.vendorsystem.VendorProducer.jms.controller.ProducerController;
import com.soa.vendorsystem.VendorProducer.jms.model.Vendor;
import com.soa.vendorsystem.VendorProducer.jms.sender.MessageSender;

@Component
public class MessageService {
	private static Logger logger = LogManager.getLogger(ProducerController.class);
	@Autowired
	MessageSender messageSender;

	public void process(Vendor vendor) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			String json = mapper.writeValueAsString(vendor);
			logger.info("Message in Json format:" + json);
			messageSender.send(json);
		} catch (JsonProcessingException e) {
			logger.error("JsonProcessingException");
		}

	}

}
