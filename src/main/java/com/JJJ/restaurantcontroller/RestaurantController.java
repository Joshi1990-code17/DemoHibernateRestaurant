package com.JJJ.restaurantcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JJJ.RestaurantDto.RestaurantDto;
import com.JJJ.restaurantservice.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantservice;

	@GetMapping(value ="/{name}/details")
	public RestaurantDto getRestaurantList(@Validated@PathVariable(value = "name") String name) {
		return restaurantservice.getRestaurants(name);
	}

	@GetMapping(value = "/all")
	public ArrayList<RestaurantDto> getAllRestaurantsList() {
		return restaurantservice.getRestaurantlist();
	}
	
	@PostMapping(value="")
	public void sendResturantList (@Validated @RequestBody RestaurantDto dto) {
		System.out.println(dto.toString());
		
	}
		@PutMapping(value="")
		public void sendResturant (@Validated @RequestBody RestaurantDto dto) {
			System.out.println(dto.toString());
			
	}

	public RestaurantService getRestaurantservice() {
		return restaurantservice;
	}

	public void setRestaurantservice(RestaurantService restaurantservice) {
		this.restaurantservice = restaurantservice;
	}

}
