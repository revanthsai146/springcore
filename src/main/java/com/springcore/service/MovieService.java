package com.springcore.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springcore.sample.Movie;
@Component
public class MovieService {
	static LocalDate date1=LocalDate.of(2022, 01, 10);
	static LocalDate date2=LocalDate.of(2022, 03, 8);
	private static final Movie[] MOVIES;
	static {
	MOVIES=new Movie[]{
			new Movie("RRR",date1,1250),
			new Movie("KGF2",date2,1200)
	};
	}
	
public List<Movie> getAllMovies() {

List<Movie> movies=new ArrayList();
for(Movie movie:MOVIES) {
	movies.add(movie);
	}
return movies;
	
}

public List<Movie> getMoviesByYear(LocalDate date){
	List<Movie> movies=new ArrayList();


	
	for(Movie movie:MOVIES) {
		System.out.println("before");
		System.out.println(date);
		System.out.println(movie.getReleaseDate());
		System.out.println("after");
		
		if(date.equals(movie.getReleaseDate())) {
			movies.add(movie);
		}
			
	}
	return movies;
	
}

public List<Movie> getMoviesByCollection(Integer collection){
	List<Movie> movies=new ArrayList();
	
	for(Movie movie:MOVIES) {
		if(collection.equals(movie.getCollection())) {
			movies.add(movie);
		}
				
	}
	return movies;
	
}


}
