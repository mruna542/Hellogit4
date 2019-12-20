package com.csi.springmvc.CustomerDatabaseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.csi.model", "com.csi.service", "com.csi.controller" })
public class CustomerDatabaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDatabaseApiApplication.class, args);
	}

}
