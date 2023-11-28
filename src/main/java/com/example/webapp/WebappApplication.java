package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication  {
	
/*	@Autowired
	private CustomProperties properties;
	
	@Autowired
	private EmployeeProxy employeeProxy;*/

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	/*@Override // declenche error si le serveur de l api n est pas runné
	public void run(String... args) throws Exception {
		System.out.println(properties.getApiUrl());
		employeeProxy.getEmployees();
	}*/
}
