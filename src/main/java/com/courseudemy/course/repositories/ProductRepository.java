package com.courseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
