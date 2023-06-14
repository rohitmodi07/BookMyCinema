package com.bookmycinema.bookmycinema.model;

import java.util.List;


public class Movie {
	private String movieName;
	private String movieId;
	private List<String> listOfTheatre;
	
	public Movie(String movieName, String movieId, List<String> listOfTheatre) {
		super();
		this.movieName = movieName;
		this.movieId = movieId;
		this.listOfTheatre = listOfTheatre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}


	public List<String> getListOfTheatre() {
		return listOfTheatre;
	}

	public void setListOfTheatre(List<String> listOfTheatre) {
		this.listOfTheatre = listOfTheatre;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieId=" + movieId + ", listOfTheatre=" + listOfTheatre + "]";
	}
	
	
}
