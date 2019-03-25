package com.fortinet.dao;

import java.util.List;

import com.fortinet.beans.Restaurant;

public interface RestaurantDao {
	public List<Restaurant> findAll();
}
