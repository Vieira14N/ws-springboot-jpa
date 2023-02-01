package com.vieira14n.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vieira14n.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
