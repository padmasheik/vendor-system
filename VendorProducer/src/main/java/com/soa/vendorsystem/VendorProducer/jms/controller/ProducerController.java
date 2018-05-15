package com.soa.vendorsystem.VendorProducer.jms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soa.vendorsystem.VendorProducer.jms.model.Vendor;
import com.soa.vendorsystem.VendorProducer.jms.service.MessageService;

@Controller
public class ProducerController {
	@Autowired
	MessageService messageService;
	private static Logger logger = LogManager.getLogger(ProducerController.class);

	@RequestMapping("/")
	public String renderVendorPage(Vendor vendor, Model model) {
		logger.info("Rendering Index JSP");
		return "index";

	}

	@RequestMapping(value = "/vendor", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("vendor") Vendor vendor, Model model) {
		logger.info("Processing vendor Object");
		messageService.process(vendor);
		logger.info(vendor.toString());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("message", "Vendor added successfully");
		vendor = new Vendor();
		mv.addObject("vendor", vendor);
		return mv;
	}
}
