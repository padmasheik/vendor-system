package com.soa.vendorsystem.VendorProducer.jms.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.soa.vendorsystem.VendorProducer.jms.model.Vendor;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProducerControllerTest {
	Model model;
	@Autowired
	ProducerController producerController;
	@Autowired
	Vendor vendor;

	@Before
	public void setUp() throws Exception {
		vendor.setVendorName("Asher Bakery");
		vendor.setFirstName("Asher");
		vendor.setLastName("savvi");
		vendor.setStreetAddress("123 main st");
		vendor.setCity("Baketown");
		vendor.setState("iowa");
		vendor.setPhoneNumber("1234567890");
		vendor.setEmail("ash@gmail.com");
		vendor.setZipCode("12345");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRenderVendorPage() {
		assertEquals("index", producerController.renderVendorPage(vendor, model));
		System.out.println("RenderVendorPage tested Successfully");
	}

	@Test
	public void testProcessRequest() {
		ModelAndView mv = producerController.processRequest(vendor, model);
		assertEquals("index", mv.getViewName());
		System.out.println("process request tested Successfully");
	}

}
