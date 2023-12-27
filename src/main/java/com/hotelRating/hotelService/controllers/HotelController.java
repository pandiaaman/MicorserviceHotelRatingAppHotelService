package com.hotelRating.hotelService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelRating.hotelService.models.Hotel;
import com.hotelRating.hotelService.servicesImpl.HotelServiceImpl;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelServiceImpl hoterService;
	
	//get all hotels
	@GetMapping(value="/")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		try {
			List<Hotel> allHotels = this.hoterService.getAllHotels();
			
			if(allHotels!=null) {
				return ResponseEntity.status(HttpStatus.OK).body(allHotels);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	//get hotel by id
	@GetMapping(value="/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String hotelId){
		try {
			Hotel hotel = this.hoterService.getHotelById(hotelId);
			
			if(hotel!=null) {
				return ResponseEntity.status(HttpStatus.OK).body(hotel);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	
	//save a hotel in the list
	@PostMapping("/")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		try {
			Hotel addedHotel = this.hoterService.saveHotel(hotel);
			
			if(addedHotel!=null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(addedHotel);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
}
