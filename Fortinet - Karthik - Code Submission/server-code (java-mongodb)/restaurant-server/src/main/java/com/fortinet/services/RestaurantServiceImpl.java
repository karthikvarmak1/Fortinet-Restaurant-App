package com.fortinet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortinet.beans.Restaurant;
import com.fortinet.dao.RestaurantDao;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	RestaurantDao restaurantDao;
	
	@Override
	public List<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return restaurantDao.findAll();
	}

}
