package com.fortinet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.fortinet.beans.Restaurant;

@Repository
@Qualifier("restaurantDao")
public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	MongoTemplate mongoTemplate;

	final String COLLECTION = "restaurant-list";
	
	@Override
	public List<Restaurant> findAll() {
		// TODO Auto-generated method stub
		System.out.println("inside dao");
		List<Restaurant> list = (List<Restaurant>) mongoTemplate.findAll(Restaurant.class);
		return list;
	}

}
