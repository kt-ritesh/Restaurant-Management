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
    private String restaurantOwnerName;
    private String restaurantSpecialty;
    private String restaurantAddress;
    private String restaurantContact;
    private Integer restaurantNoOfStaff;

}
