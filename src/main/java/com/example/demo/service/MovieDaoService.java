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

import com.example.demo.dao.MovieDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Movie;
@Component
public class MovieDaoService {

	private MovieDAO movieDAO;
	@Autowired
	public MovieDaoService(MovieDAO movieDao) 
	{
		super();
		movieDao = this.movieDAO;
	}
	
	@Transactional
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieDAO.findAll();
	}

	@Transactional
	public Optional<Movie> findById(Integer id) {
		Optional<Movie> movie = movieDAO.findById(id);
		return movie;
	}

	@Transactional
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDAO.save(movie);
	}

	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		movieDAO.deleteById(id);
	}
	
	@Transactional
	public void deleteAll() {
		// TODO Auto-generated method stub
		movieDAO.deleteAll();
	}

}
