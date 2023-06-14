package com.bookmycinema.bookmycinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookmycinema.bookmycinema.connector.StaticDataProvider;
import com.bookmycinema.bookmycinema.model.NotificationRequest;
import com.bookmycinema.bookmycinema.model.PaymentRequest;
import com.bookmycinema.bookmycinema.model.SeatReservationRequest;

@RestController
public class BookMyCinemaController {
	
	@Autowired
	private StaticDataProvider staticDataProvider;
	
	
	@GetMapping(value = "/search/movie")
	public List<String> searchTheatreBasedOnMovie(@RequestParam("name") String name) {
		
		
		return staticDataProvider.getTheatreList(name);
		
	}
	
	@GetMapping(value = "/search/theatre")
	public List<String> searchMovieBasedOnTheatre(@RequestParam ("name") String name) {
		
			return staticDataProvider.getMovieList(name);
	}
	
	@PostMapping(value = "/reserve")
	private void reserveSelectedSeats(@RequestBody SeatReservationRequest seatReserveRequest) {
		
		//logic to reserve the seat
		
	}
	
	@PostMapping(value = "/payment")
	private void initiatePayment(@RequestBody PaymentRequest paymentRequest) {
		
		// logic to process payment
		
	}
	
	@PostMapping(value = "/notification")
	private void notifyUser(@RequestBody NotificationRequest notificationRequest) {
		
		//logic to send email and sms to customer
		
	}
	
	@PostMapping(value = "/cancel/{bookinId}")
	private void cancelBooking(@RequestParam int bookinId) {
		
		//logic to cancel the booking
		
	}

}
