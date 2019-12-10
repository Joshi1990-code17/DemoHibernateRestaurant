package com.JJJ.util;

import java.util.HashMap;
import java.util.Map;

import com.JJJ.RestaurantDto.RestaurantDto;

public class InMemoryDatabase {

	public static Map<String, RestaurantDto> restaurantslist;
	
	static {
		
		restaurantslist = new HashMap<String, RestaurantDto>();
		
		RestaurantDto restaurant1 = new RestaurantDto();
		restaurant1.setName("Chick-Fil-A");
		restaurant1.setAddress("Reston");
		restaurant1.setPhonenumber("202-345-12678");
		restaurantslist.put("Chick-Fil-A",restaurant1);
		
		RestaurantDto restaurant2 = new RestaurantDto();
		restaurant2.setName("Chipotle");
		restaurant2.setAddress("Vienna");
		restaurant2.setPhonenumber("571-345-12678");
		restaurantslist.put("Chipotle", restaurant2);
		
		RestaurantDto restaurant3 = new RestaurantDto();
		restaurant3.setName("Papa John");
		restaurant3.setAddress("Chantilly");
		restaurant3.setPhonenumber("206-666-12678");
		restaurantslist.put("Papa John", restaurant3);
	}
}
