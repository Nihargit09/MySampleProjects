package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public List<Employee> getEmployees() {
		return dao.getAllEmployees();

	}

	public Employee getEmployeeNull() throws EmployeeServiceException {

		return null;

	}

	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();

	}
}
