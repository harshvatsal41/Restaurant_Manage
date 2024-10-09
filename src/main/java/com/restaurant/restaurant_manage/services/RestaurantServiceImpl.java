package com.restaurant.restaurant_manage.services;

import com.restaurant.restaurant_manage.dao.RestaurantDao;
import com.restaurant.restaurant_manage.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
//    List<Restaurant> list;
    @Autowired
    private final RestaurantDao restaurantDao;
    public RestaurantServiceImpl(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @Override
    public List<Restaurant> getRestaurants() {
        return restaurantDao.findAll();
    }

    @Override
    public Restaurant getRestaurant(long restaurantID) {
        return restaurantDao.findById(restaurantID).get();
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        restaurantDao.save(restaurant);
        return restaurant;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        restaurantDao.save(restaurant);
        return restaurant;
    }

    @Override
    public void deleteRestaurant(long restaurantID) {
        Restaurant entity = restaurantDao.getOne(restaurantID);
        restaurantDao.delete(entity);
    }
}
