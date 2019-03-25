import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})

export class RestaurantService {
  constructor(private readonly http: HttpClient){}

  getRestaurantList() {
    return this.http.get('/fortinet/restaurant-app/restaurants/list');
  }
}