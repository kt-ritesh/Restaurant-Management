package com.ritesh.RestaurantManagement.controller;

import com.ritesh.RestaurantManagement.model.Restaurant;
import com.ritesh.RestaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("restaurants")
    public List<Restaurant> GetAllRestaurant(){
        return restaurantService.AllRestaurant();
    }

    @GetMapping("restaurant/{rId}")
    public Restaurant GetRestaurantById(@PathVariable Integer rId){
        return restaurantService.getRestaurantById(rId);
    }
    @PostMapping("restaurant")
    public String AddNewRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addNewRestaurant(restaurant);
    }

    @PutMapping("restaurant/{rId}")
    public String UpdateRestaurant(@PathVariable Integer rId, @RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurant(rId, restaurant);
    }

    @DeleteMapping("restaurant/{rId}")
    public String DeleteRestaurant(@PathVariable Integer rId){
        return restaurantService.deleteRestaurant(rId);
    }
}
