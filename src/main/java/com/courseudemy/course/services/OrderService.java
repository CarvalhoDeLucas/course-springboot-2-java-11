package com.courseudemy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseudemy.course.entities.Order;
import com.courseudemy.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findUserById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
