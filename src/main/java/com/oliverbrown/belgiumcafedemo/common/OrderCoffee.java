package com.oliverbrown.belgiumcafedemo.common;

public class OrderCoffee implements Order {

    public OrderCoffee()  {
        System.out.print("In Class " + getClass().getSimpleName());
    }

    @Override
    public String getDailtyOrderCount() {
        return "500 Coffees Today!!" ;
    }
}
