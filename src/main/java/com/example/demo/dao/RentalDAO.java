package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rental;
import com.example.demo.entity.User;
@Repository
public interface RentalDAO extends JpaRepository<Rental, Integer> {
	
//	public List<Rental> findAll();
//	public Optional<Rental> findById(Integer id);
//	public Rental createRental(Rental rental);
//	public void deleteById(Integer id); 
//	public void deleteAll();


}
