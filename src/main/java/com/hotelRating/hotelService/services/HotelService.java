package com.hotelRating.hotelService.services;

import java.util.List;

import com.hotelRating.hotelService.models.Hotel;

public interface HotelService {

	//get all hotels
	public List<Hotel> getAllHotels();
	
	//get a single hotel
	public Hotel getHotelById(String hotelId);
	
	//create a hotel
	public Hotel saveHotel(Hotel hotel);
}
