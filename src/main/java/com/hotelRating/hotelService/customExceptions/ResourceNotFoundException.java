package com.hotelRating.hotelService.customExceptions;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
		System.out.println("resource not found in the server exception");
	}

}
