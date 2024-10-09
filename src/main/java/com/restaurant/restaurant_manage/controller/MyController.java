package com.restaurant.restaurant_manage.controller;

import com.restaurant.restaurant_manage.entities.Restaurant;
import com.restaurant.restaurant_manage.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {

    @Autowired
    private RestaurantService restaurantService;

    //get the restaurants
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants()
    {
        return this.restaurantService.getRestaurants();
    }

    //get the restaurant with its ID
    @GetMapping("/restaurants/{restaurantID}")
    public Restaurant getRestaurant(@PathVariable String restaurantID){
        long x = Long.parseLong(restaurantID);
        return this.restaurantService.getRestaurant(x);
    }


    // add new course
    @PostMapping(path = "/restaurants",consumes = "application/json")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantService.addRestaurant(restaurant);
    }
    //updating the restaurant data
    @PutMapping ("/restaurants")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantService.updateRestaurant(restaurant);
    }
    //delete the restaurant data
    @DeleteMapping("/restaurants/{restaurantID}")
    public ResponseEntity<HttpStatus> deleteRestaurant(@PathVariable String restaurantID){
        try{
            this.restaurantService.deleteRestaurant(Long.parseLong(restaurantID));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

//{
//        "restaurant": "paradize",
//        "description": "Bhot badhiya hai mast se kaho bhyi"
//    }