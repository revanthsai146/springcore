package com.springcore.sample;

import java.time.LocalDate;

public class Movie {
	private  String movieName;
	private  LocalDate releaseDate;
	private  int collection;
	

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	public void setCollection(int collection) {
		this.collection = collection;
	}


	public Movie(String movieName, LocalDate releaseDate, int collection) {
		super();
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.collection = collection;
	}


	public String getMovieName() {
		return movieName;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public int getCollection() {
		return collection;
	}


	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", releaseDate=" + releaseDate + ", collection=" + collection + "]";
	}
	

}
