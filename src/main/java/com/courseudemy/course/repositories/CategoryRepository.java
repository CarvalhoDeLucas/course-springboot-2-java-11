package com.courseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
