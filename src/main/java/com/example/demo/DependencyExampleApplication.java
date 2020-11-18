package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyExampleApplication {

	public static void main(String[] args) {
		
		//the context will create Spring objects during runtime
		ConfigurableApplicationContext ctx =SpringApplication.run(DependencyExampleApplication.class, args);
	
		// create the Customer object and inject
		Customer cust = ctx.getBean(Customer.class);
		
		//invoke method in Customer object
		cust.hello();
	
	
	}

}
