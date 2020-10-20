package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {
	
//	public List<Movie> findAll();
//	public Optional<Movie> findById(Integer id);
//	public Movie createMovie(Movie movie);
//	public void deleteById(Integer id); 
//	public void deleteAll();
	
//	public List<Movie> findByName(String movieName)

}
