package com.hotelRating.hotelService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name="hotel_micro_table")
@Data
public class Hotel {

	@Id
	@Column(name="hotel_id")
	private String hotelId;
	@Column(name="hotel_name")
	private String hotelName;
	@Column(name="hotel_address")
	private String hotelAddress;
	@Column(name="hotel_details")
	private String hotelDetails;
	
}
