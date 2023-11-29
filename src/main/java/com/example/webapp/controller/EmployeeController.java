package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.webapp.model.Employee;
import com.example.webapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
    @GetMapping("/")
    public String home(Model model) {
    	Iterable<Employee> listEmployee = service.getEmployees();
		model.addAttribute("employees", listEmployee);
		return "home";
    }

}