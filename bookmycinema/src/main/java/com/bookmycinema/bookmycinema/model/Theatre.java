package com.bookmycinema.bookmycinema.model;

import java.util.List;


public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private int toShow;
	private int fromShow;
	private List<String> listOfMovies;
	
	public Theatre(int theatreId, String theatreName, int toShow, int fromShow, List<String> listOfMovies) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.toShow = toShow;
		this.fromShow = fromShow;
		this.listOfMovies = listOfMovies;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getToShow() {
		return toShow;
	}

	public void setToShow(int toShow) {
		this.toShow = toShow;
	}

	public int getFromShow() {
		return fromShow;
	}

	public void setFromShow(int fromShow) {
		this.fromShow = fromShow;
	}

	public List<String> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<String> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", toShow=" + toShow + ", fromShow="
				+ fromShow + ", listOfMovies=" + listOfMovies + "]";
	}

}
