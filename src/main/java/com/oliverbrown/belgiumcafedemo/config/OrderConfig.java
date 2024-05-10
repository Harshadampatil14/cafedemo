package com.oliverbrown.belgiumcafedemo.config;

import com.oliverbrown.belgiumcafedemo.common.Order;
import com.oliverbrown.belgiumcafedemo.common.OrderCoffee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
   // @Bean
    @Bean("coffee")
    public Order orderCoffee() {
        return new OrderCoffee();
    }
}
