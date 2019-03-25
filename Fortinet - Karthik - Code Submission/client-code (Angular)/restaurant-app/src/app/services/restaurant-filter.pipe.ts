import { Pipe, PipeTransform } from '@angular/core';
import { RestaurantItem } from '../model/restaurant.interface';

@Pipe({ name: 'restaurantsFilter' })
export class RestaurantsFilterPipe implements PipeTransform {
    transform(restaurants: any[], value: string): any[] {
        const search: string = value ? value.toLocaleLowerCase() : null;
        return search ? restaurants.filter((restaurant: RestaurantItem) =>
        restaurant.restaurant_Name.toLocaleLowerCase().startsWith(search)) : restaurants;
    }
}