package com.restaurant.restaurant_manage.services;
import com.restaurant.restaurant_manage.entities.Restaurant;

import java.util.List;

public interface RestaurantService {
    public List<Restaurant> getRestaurants();
    public Restaurant getRestaurant(long restaurantID);
    public Restaurant addRestaurant(Restaurant restaurant);
    public Restaurant updateRestaurant(Restaurant restaurant);
    public void deleteRestaurant(long restaurantID);
}
