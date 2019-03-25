package com.fortinet.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurant-list")
public class Restaurant {
	@Id
	private String id;
	private float Restaurant_D;
	private String Restaurant_Name;
	private String Cuisines;
	private float Average_Cost_for_two;
	private String Currency;
	private String Has_Table_booking;
	private String Has_Online_delivery;
	private float Aggregate_rating;
	private String Rating_color;
	private String Rating_text;
	private float Votes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getRestaurant_D() {
		return Restaurant_D;
	}
	public void setRestaurant_D(float restaurant_D) {
		Restaurant_D = restaurant_D;
	}
	public String getRestaurant_Name() {
		return Restaurant_Name;
	}
	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}
	public String getCuisines() {
		return Cuisines;
	}
	public void setCuisines(String cuisines) {
		Cuisines = cuisines;
	}
	public float getAverage_Cost_for_two() {
		return Average_Cost_for_two;
	}
	public void setAverage_Cost_for_two(float average_Cost_for_two) {
		Average_Cost_for_two = average_Cost_for_two;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getHas_Table_booking() {
		return Has_Table_booking;
	}
	public void setHas_Table_booking(String has_Table_booking) {
		Has_Table_booking = has_Table_booking;
	}
	public String getHas_Online_delivery() {
		return Has_Online_delivery;
	}
	public void setHas_Online_delivery(String has_Online_delivery) {
		Has_Online_delivery = has_Online_delivery;
	}
	public float getAggregate_rating() {
		return Aggregate_rating;
	}
	public void setAggregate_rating(float aggregate_rating) {
		Aggregate_rating = aggregate_rating;
	}
	public String getRating_color() {
		return Rating_color;
	}
	public void setRating_color(String rating_color) {
		Rating_color = rating_color;
	}
	public String getRating_text() {
		return Rating_text;
	}
	public void setRating_text(String rating_text) {
		Rating_text = rating_text;
	}
	public float getVotes() {
		return Votes;
	}
	public void setVotes(float votes) {
		Votes = votes;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", Restaurant_D=" + Restaurant_D + ", Restaurant_Name=" + Restaurant_Name
				+ ", Cuisines=" + Cuisines + ", Average_Cost_for_two=" + Average_Cost_for_two + ", Currency=" + Currency
				+ ", Has_Table_booking=" + Has_Table_booking + ", Has_Online_delivery=" + Has_Online_delivery
				+ ", Aggregate_rating=" + Aggregate_rating + ", Rating_color=" + Rating_color + ", Rating_text="
				+ Rating_text + ", Votes=" + Votes + "]";
	}
	
}
