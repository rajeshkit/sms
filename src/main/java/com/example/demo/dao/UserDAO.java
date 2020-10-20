package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

//	public List<User> findAll();
//	public Optional<User> findById(String id);
//	public User createUser(User user);
//	public void deleteById(String id); 
//	public void deleteAll();
//	
}
