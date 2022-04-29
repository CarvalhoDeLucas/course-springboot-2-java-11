package com.courseudemy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseudemy.course.entities.Category;
import com.courseudemy.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Category findCategoryById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
