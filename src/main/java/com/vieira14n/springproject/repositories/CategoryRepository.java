package com.vieira14n.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vieira14n.springproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
}
