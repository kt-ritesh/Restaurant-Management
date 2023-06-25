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

    @PutMapping("restaurant/{rId}/{Specialty}")
    public String UpdateRestaurant(@PathVariable Integer rId, @PathVariable String Specialty){
        return restaurantService.updateRestaurant(rId, Specialty);
    }
    @PutMapping("restaurant/addStaff/{rId}/{staff}")
    public String AddRestaurantStaff(@PathVariable Integer rId, @PathVariable Integer staff){
        return restaurantService.addRestaurantStaff(rId, staff);
    }

    @PutMapping("restaurant/removeStaff/{rId}/{staff}")
    public String RemoveRestaurantStaff(@PathVariable Integer rId, @PathVariable Integer staff){
        return restaurantService.removeRestaurantStaff(rId, staff);
    }
    @DeleteMapping("restaurant/{rId}")
    public String DeleteRestaurant(@PathVariable Integer rId){
        return restaurantService.deleteRestaurant(rId);
    }
}
