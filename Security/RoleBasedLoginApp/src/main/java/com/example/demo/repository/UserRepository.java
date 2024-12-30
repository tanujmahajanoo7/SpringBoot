package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;

@RequestMapping
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
