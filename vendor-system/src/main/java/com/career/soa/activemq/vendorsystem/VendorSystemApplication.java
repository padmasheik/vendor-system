package com.career.soa.activemq.vendorsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class VendorSystemApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(VendorSystemApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(VendorSystemApplication.class, args);

	}
}
