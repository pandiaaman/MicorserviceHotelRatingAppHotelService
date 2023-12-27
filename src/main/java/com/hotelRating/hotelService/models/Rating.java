package com.hotelRating.hotelService.models;

import lombok.Data;


//NOT USED currently but we want to make sure that when a hotel is seen, all related ratings
//to that hotel are also shown (similar to how we show details for each user right now_)
@Data
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String comment;
	
	private Hotel hotel;
}
