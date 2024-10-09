package com.restaurant.restaurant_manage.dao;

import com.restaurant.restaurant_manage.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantDao extends JpaRepository<Restaurant,Long> {

}
