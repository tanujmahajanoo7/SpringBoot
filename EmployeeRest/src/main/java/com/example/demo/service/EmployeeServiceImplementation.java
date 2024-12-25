package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRopo;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRopo employeeRepo;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if (employeeRepo.existsById(employee.getId())) {
			return employeeRepo.save(employee);
		}
		throw new RuntimeException("Employee not found for update");
	}

	@Override
	public String deleteEmployee(int id) {

		if (employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			return "Delete successfully";
		}
		return "Employee not found";
	}

}
