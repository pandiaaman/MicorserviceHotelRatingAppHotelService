package com.hotelRating.hotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelRating.hotelService.models.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
