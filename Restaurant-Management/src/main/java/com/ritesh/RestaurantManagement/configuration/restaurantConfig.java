package com.ritesh.RestaurantManagement.configuration;

import com.ritesh.RestaurantManagement.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.LimitedDataBufferList;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class restaurantConfig {

    @Bean
    public List<Restaurant> getRestaurantList(){
        return new ArrayList<>();
    }

}
