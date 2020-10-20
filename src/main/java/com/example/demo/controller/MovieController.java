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

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieDaoService;

@RestController
@RequestMapping("/api")

public class MovieController {

	private MovieDaoService moviedaoservice;
	
	@Autowired
	public MovieController(MovieDaoService moviedaoservice) {
		super();
		moviedaoservice = this.moviedaoservice;
	}
	
	@GetMapping("/movie")
	public List<Movie> getAllMovie(){
		return moviedaoservice.findAll();
	}
	
	@GetMapping("/movie/{id}")
	public List<Movie> getMovieById(@PathVariable Integer id){
		return moviedaoservice.findAll();
	}
	
	@PutMapping("/movie")
	public Movie createMovie(@RequestBody Movie movie) {
		return moviedaoservice.createMovie(movie);
	}
	
	@DeleteMapping("/movie/{id}")
	public void deleteById(@PathVariable Integer id) {
		 moviedaoservice.deleteById(id);
	}

	@DeleteMapping("/movie")
	public void deleteAll() {
		moviedaoservice.deleteAll();
	}
}
