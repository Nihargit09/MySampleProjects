package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exceptionhandling.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceException;

@RestController
public class HelloController {
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/get")
	public List<Employee> getEmployees() throws EmployeeServiceException {
		try {
		 List<Employee> employees = service.getEmployees();
		if (employees == null) {
			throw new ResourceNotFoundException("employee not found");

		}
		return employees;

	} catch (Exception e) {
		throw new EmployeeServiceException("internal server exception");

	}

	}
	
	@GetMapping("/")
	public String hello() {
		return "welcome to spring boot";
		// TODO Auto-generated method stub

	}

	
	@GetMapping("/getEmpployee2")
	public Employee getEmp2() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee employee = service.getEmployeeNull();
			if (employee == null) {
				throw new ResourceNotFoundException("employee not found");

			}
			return employee;

		} catch (Exception e) {
			throw new EmployeeServiceException("internal server exception");

		}

	}

	@GetMapping("/getEmpployee3")
	public Employee getEmp3() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee employee = service.getEmployeeException();
			if (employee == null) {
				throw new ResourceNotFoundException("employee not found");

			}
			return employee;

		} catch (Exception e) {
			throw new EmployeeServiceException("internal server exception");

		}

	}
}
