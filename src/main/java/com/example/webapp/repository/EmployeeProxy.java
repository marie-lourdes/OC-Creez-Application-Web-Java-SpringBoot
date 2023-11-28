package com.example.webapp.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.webapp.CustomProperties;

public class EmployeeProxy {

	@Autowired
	private CustomProperties props;

	/**
	 * Get all employees
	 * 
	 * @return An iterable of all employees
	 */

	public Iterable<Employee> getEmployees() {
		String baseApiUrl = props.getApiUrl(); // recupere la propriété apiUrl
		String getEmployeesUrl = baseApiUrl + "/employees";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Iterable<Employee>> response = restTemplate.exchange(getEmployeesUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Iterable<Employee>>() {
				});

		System.out.println("Get Employees call " + response.getStatusCode().toString());

		return response.getBody();
	}
}
