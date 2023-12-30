package com.springcore.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springcore.sample.Movie;
import com.springcore.service.MovieService;

@Component
public class MovieController {
	
	private MovieService movieservice;

	public MovieService getMovieservice() {
		return movieservice;
	}
	
	public List<Movie> getMoviesList(){
		List<Movie> movies=movieservice.getAllMovies();
		return movies;
	}
	public List<Movie> getMoviesByDate(LocalDate date){
		List<Movie> movies=movieservice.getMoviesByYear(date);
		return movies;
		
	}

	
	
	
}
