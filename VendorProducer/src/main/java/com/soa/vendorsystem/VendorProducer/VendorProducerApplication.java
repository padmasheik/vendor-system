package com.soa.vendorsystem.VendorProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class VendorProducerApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(VendorProducerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(VendorProducerApplication.class, args);
		System.out.println("run success!!!!");
	}
}
