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

import com.example.demo.entity.Rental;
import com.example.demo.service.RentalDaoService;

@RestController
@RequestMapping("/api")

public class RentalController {

	private RentalDaoService rentaldaoservice;
	
	@Autowired
	public RentalController(RentalDaoService rentaldaoservice) {
		super();
		rentaldaoservice = this.rentaldaoservice;
	}
	
	@GetMapping("/rental")
	public List<Rental> getAllUser(){
		return rentaldaoservice.findAll();
	}
	
	@GetMapping("/rental/{id}")
	public List<Rental> getUserById(@PathVariable Integer id){
		return rentaldaoservice.findAll();
	}
	
	@PutMapping("/rental")
	public Rental createRental(@RequestBody Rental rental) {
		return rentaldaoservice.createRental(rental);
	}
	
	@DeleteMapping("/rental/{id}")
	public void deleteById(@PathVariable Integer id) {
		 rentaldaoservice.deleteById(id);
	}

	@DeleteMapping("/rental")
	public void deleteAll() {
		rentaldaoservice.deleteAll();
	}
}
