package com.courseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
