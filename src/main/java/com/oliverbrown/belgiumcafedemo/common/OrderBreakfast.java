package com.oliverbrown.belgiumcafedemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OrderBreakfast implements Order {
    public OrderBreakfast() {
        System.out.println("In Class " + getClass().getSimpleName());
    }

    @Override
    public String getDailtyOrderCount() {
        return "200 Breakfast Today +++++++++++++" ;
    }
}
