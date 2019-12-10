package com.JJJ.restaurantservice;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.JJJ.RestaurantDto.RestaurantDto;
import com.JJJ.util.InMemoryDatabase;

@Service
public class RestaurantService {

	public RestaurantDto getRestaurants(String name) {
		return InMemoryDatabase.restaurantslist.get(name);
	}
	
	public ArrayList<RestaurantDto> getRestaurantlist(){
		ArrayList<RestaurantDto> restlist = new ArrayList<RestaurantDto>(InMemoryDatabase.restaurantslist.values());
		return restlist;
		
	}
	
}
