import { RestaurantItem } from './restaurant.interface';

export class Restaurant {
    restaurantItems: RestaurantItem[];
    canSubscribe: boolean;
    columnHeaders: any[];
    totalRecords: number;

    constructor() {
        this.restaurantItems = [];
        this.canSubscribe = true;
        this.columnHeaders = [
            { field: 'restaurant_D', header: 'Restaurant ID' },
            { field: 'restaurant_Name', header: 'Restaurant Name' },
            { field: 'cuisines', header: 'Cuisines' },
            { field: 'average_Cost_for_two', header: 'Average Cost for two' },
            { field: 'currency', header: 'Currency' },
            { field: 'has_Table_booking', header: 'Has Table booking' },
            { field: 'has_Online_delivery', header: 'Has Online delivery' },
            { field: 'aggregate_rating', header: 'Aggregate ating' },
            { field: 'rating_color', header: 'Rating color' },
            { field: 'rating_text', header: 'Rating text' },
            { field: 'votes', header: 'Votes' }
          ];
    }
}