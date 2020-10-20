package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RentalDAO;
import com.example.demo.entity.Rental;
import com.example.demo.entity.User;
@Component
public class RentalDaoService  {

    private RentalDAO rentalDAO;
    
    @Autowired
    public RentalDaoService(RentalDAO rentalDAO) {
    	super();
    	rentalDAO = this.rentalDAO;
    }

	
	@Transactional
	public List<Rental> findAll() {
		// TODO Auto-generated method stub
		return rentalDAO.findAll();
	}

	
	@Transactional
	public Optional<Rental> findById(Integer id) {
		Optional<Rental> rental = rentalDAO.findById(id);
 		return rental;
	}

	
	@Transactional
	public Rental createRental(Rental rental) {
		// TODO Auto-generated method stub
		return rentalDAO.save(rental);
	}

	
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		rentalDAO.deleteById(id);
	}

	@Transactional
	public void deleteAll() {
		// TODO Auto-generated method stub
		rentalDAO.deleteAll();
	}

}
