package com.courseudemy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseudemy.course.entities.Product;
import com.courseudemy.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findProductById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
}
