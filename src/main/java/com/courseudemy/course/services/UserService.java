package com.courseudemy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseudemy.course.entities.User;
import com.courseudemy.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findUserById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = userRepository.getById(id);
		updateDate(entity, obj);
		return userRepository.save(entity);
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
