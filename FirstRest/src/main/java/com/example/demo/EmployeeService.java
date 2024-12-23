package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee findEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public List<Employee> FindhAllEmployee() {
		return employeeRepository.findAll();
	}
	
}
