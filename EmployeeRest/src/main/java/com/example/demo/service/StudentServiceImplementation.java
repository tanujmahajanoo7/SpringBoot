package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository sr;
	
	@Override
	public Student createStudent(Student student) {
		return sr.save(student);
	}

	@Override
	public List<Student> fetchAllStudent() {
		return sr.findAll();
	}

	@Override
	public Student fetchStudentById(int id) {
		return sr.findById(id).orElse(null);
	}

	@Override
	public Student updateStudent(Student student) {
		return sr.save(student);
	}

	@Override
	public String deleteStudent(int id) {
		sr.deleteById(id);
		return "Deleted Sucessfully";
	}
}
