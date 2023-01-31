package com.vieira14n.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vieira14n.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
