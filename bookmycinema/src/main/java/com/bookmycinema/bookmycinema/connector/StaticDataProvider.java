package com.bookmycinema.bookmycinema.connector;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StaticDataProvider {
	
	public List<String> getMovieList(String theatreName){
		
        Map<String, List<String>> theatreMovieMap = new HashMap<>();
		
        theatreMovieMap.put("PVR", Arrays.asList("Mission Impossible", "Dark Knight", "Batman"));
        theatreMovieMap.put("CINEMAX", Arrays.asList("Mission Impossible", "Dark Knight", "Batman"));
        theatreMovieMap.put("IMAX", Arrays.asList("Mission Impossible", "Superman"));
        theatreMovieMap.put("BLR", Arrays.asList("Superman"));
		
		return theatreMovieMap.get(theatreName);
	}
	
	public List<String> getTheatreList(String movieName){
		
        Map<String, List<String>> movieTheatreMap = new HashMap<>();
		
		movieTheatreMap.put("Mission Impossible", Arrays.asList("PVR", "CINEMAX", "IMAX"));
		movieTheatreMap.put("Dark Knight", Arrays.asList("PVR", "CINEMAX"));
		movieTheatreMap.put("Superman", Arrays.asList("BLR", "IMAX"));
		movieTheatreMap.put("Batman", Arrays.asList("PVR", "CINEMAX", "IMAX"));
        
		
		return movieTheatreMap.get(movieName);
	}
	

}
