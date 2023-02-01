package com.vieira14n.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vieira14n.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
