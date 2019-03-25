
import { Component, OnInit, OnDestroy } from '@angular/core';

import { takeWhile } from 'rxjs/operators';

import * as lodash from 'lodash';
import { Restaurant } from './model/restaurant.model';
import { RestaurantService } from './services/restaurant.service';
import { RestaurantItem } from './model/restaurant.interface';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, OnDestroy {
    searchRestaurant: string = '';
    restaurantModel: Restaurant;

    constructor(private readonly movieService: RestaurantService) {
        this.restaurantModel = new Restaurant();
    }

    ngOnInit() {
        this.fetchRestaurantList();
    }

    ngOnDestroy() {
        // unsubscription of network calls when we navigate/leave out to other pages.
        this.restaurantModel.canSubscribe = false;
    }

    fetchRestaurantList() {
        this.movieService.getRestaurantList().pipe(
            (takeWhile(() => this.restaurantModel.canSubscribe))
        ).subscribe((data: RestaurantItem[]) => {
            this.restaurantModel.restaurantItems = data;
            this.restaurantModel.totalRecords = data.length;
        });
    }

}