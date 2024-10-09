package com.restaurant.restaurant_manage.entities;


import jakarta.persistence.*;
import lombok.*;


@Entity(name="restaurant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restaurantID;

    private String restaurant;

    private String description;

}