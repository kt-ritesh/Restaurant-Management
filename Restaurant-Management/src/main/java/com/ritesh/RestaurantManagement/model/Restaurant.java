package com.ritesh.RestaurantManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantManagerName;
    private RestaurantType restaurantType;
    private FoodType foodType;
    private String restaurantAddress;
    private String restaurantContact;
    private Integer restaurantNoOfStaff;

}
