package com.hotelRating.hotelService.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelRating.hotelService.customExceptions.ResourceNotFoundException;
import com.hotelRating.hotelService.models.Hotel;
import com.hotelRating.hotelService.repositories.HotelRepository;
import com.hotelRating.hotelService.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepo;
	
	@Override
	public List<Hotel> getAllHotels() {

		List<Hotel> hotels = this.hotelRepo.findAll();
		return hotels;
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		
		Hotel hotelfetched = this.hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("No hotel found with given id in the server"));
		return hotelfetched;
	}

	@Override
	public Hotel saveHotel(Hotel hotel) {
		
		//generating ids
		String randomUid = UUID.randomUUID().toString();
		hotel.setHotelId(randomUid);
		Hotel hotelSaved = this.hotelRepo.save(hotel);
		return hotelSaved;
	}
	
	//delete hotel
	
	//update hotel

}
