package com.vieira14n.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vieira14n.springproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	
}
