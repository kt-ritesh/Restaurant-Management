package com.ritesh.RestaurantManagement.service;

import com.ritesh.RestaurantManagement.model.Restaurant;
import com.ritesh.RestaurantManagement.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> AllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public String addNewRestaurant(Restaurant restaurant) {
        List<Restaurant> list = AllRestaurant();
        list.add(restaurant);

        return "Restaurant added Successfully!!";
    }

    public String updateRestaurant(Integer rId, String Specialty) {
        List<Restaurant> list = AllRestaurant();
        for(Restaurant rest : list){
            if(rest.getRestaurantId().equals(rId)){
                rest.setRestaurantSpecialty(Specialty);

                return "Restaurant Specialty update successfully!";
            }
        }
        return "Restaurant ID Not fonded!";
    }

    public Restaurant getRestaurantById(Integer rId) {
        List<Restaurant> list = AllRestaurant();
        for(Restaurant rest : list){
            if(rest.getRestaurantId().equals(rId)){
                return rest;
            }
        }
        return null;
    }

    public String deleteRestaurant(Integer rId) {
        List<Restaurant> list = AllRestaurant();
        for(Restaurant rest : list){
            if(rest.getRestaurantId().equals(rId)){
                list.remove(rest);

                return "Restaurant deleted!!";
            }
        }
        return "Id not found!";
    }

    public String addRestaurantStaff(Integer rId, Integer staff) {
        List<Restaurant> list = AllRestaurant();
        for(Restaurant rest : list){
            if(rest.getRestaurantId().equals(rId)){
                rest.setRestaurantNoOfStaff(rest.getRestaurantNoOfStaff()+staff);

                return "Staff added successfully!!";
            }
        }
        return "Restaurant Id not found!";
    }

    public String removeRestaurantStaff(Integer rId, Integer staff) {
        List<Restaurant> list = AllRestaurant();
        for(Restaurant rest : list){
            if(rest.getRestaurantId().equals(rId)){
                rest.setRestaurantNoOfStaff(rest.getRestaurantNoOfStaff()-staff);

                return "Staff removed successfully!!";
            }
        }
        return "Restaurant Id not found!";
    }
}
