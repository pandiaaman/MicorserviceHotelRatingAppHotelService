package com.hotelRating.hotelService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class MicorserviceHotelRatingAppHotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviceHotelRatingAppHotelServiceApplication.class, args);
		System.out.println("hotel service running...");
		System.out.println("###################");
	}

}
