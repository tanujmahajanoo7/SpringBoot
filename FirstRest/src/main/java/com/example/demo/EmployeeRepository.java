package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
