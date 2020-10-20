package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserDaoService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserDaoService userDaoService;
	
	/*
	 * public UserController(UserDaoService userdaoservice) { super();
	 * userdaoservice = this.userdaoservice; }
	 */	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return userDaoService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public List<User> getUserById(@PathVariable int id){
		return userDaoService.findAll();
	}
	
	@PutMapping("/user")
	public User createUser(@RequestBody User user) {
		System.out.println("Postman Content"+user.toString());
		System.out.println("This user controller"+userDaoService);
		User u = userDaoService.createUser(user);
		System.out.println("Created User controller"+u);
		return u;
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable int id) {
		userDaoService.deleteById(id);
	}

	@DeleteMapping("/user")
	public void deleteAll() {
		userDaoService.deleteAll();
	}
}
