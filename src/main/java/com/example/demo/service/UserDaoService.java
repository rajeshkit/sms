package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;

@Component
public class UserDaoService  {
	@Autowired
	public UserDAO userDAO;
	
	/*
	 * @Autowired public UserDaoService(UserDAO userDao) { super(); userDao =
	 * this.userDAO; }
	 */
	
	@Transactional
	public List<User> findAll() {
		
		return userDAO.findAll();
	}

	
	@Transactional
	public Optional<User> findById(int id) {
		Optional<User> user = userDAO.findById(id);
		return user;
	}

	
	@Transactional
	public User createUser(User user) {
		System.out.println("This User Service");
		User u = userDAO.save(user);
		System.out.println("Service" + u);
		return u;
	}

	
	@Transactional
	public void deleteById(int id) {
		userDAO.deleteById(id);
		
	}

	
	@Transactional
	public void deleteAll() {
		userDAO.deleteAll();
		
	}
		
}
