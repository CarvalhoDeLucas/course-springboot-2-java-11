package com.courseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
