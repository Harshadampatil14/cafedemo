package com.oliverbrown.belgiumcafedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OrderDrinks implements Order{
    public OrderDrinks() {
        System.out.println("In Class " + getClass().getSimpleName());
    }

    @Override
    public String getDailtyOrderCount() {
        return "300 Drinks Today +++++++++++++" ;
    }
}
