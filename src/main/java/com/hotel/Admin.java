package com.hotel;

import java.util.ArrayList;

class Admin {
	private Hotel hotel;
	public void addHotel(ArrayList<Hotel>hotels) {
		// TODO Auto-generated method stub
		String name = Zomato.sc.nextLine();
		hotels.add(new Hotel(name));

	}
	public void addFood(Hotel hotel) throws NoHotelException {
		
		hotel = Zomato.getHotel();
		hotel.addFood();
	}

}
