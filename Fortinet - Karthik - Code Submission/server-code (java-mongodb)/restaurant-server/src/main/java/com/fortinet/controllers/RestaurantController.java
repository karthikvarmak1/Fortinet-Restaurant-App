package com.fortinet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fortinet.beans.Restaurant;
import com.fortinet.services.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/list")
	public List<Restaurant> getListOfRestaurants() {
		return restaurantService.findAll();
	}

}
