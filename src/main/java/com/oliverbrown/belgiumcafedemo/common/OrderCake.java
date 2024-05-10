package com.oliverbrown.belgiumcafedemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OrderCake implements Order{

    public OrderCake() {
        System.out.println("In Class " + getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstructMethod () {
        System.out.println("In postConstructMethod... " + getClass().getSimpleName());
    }

    @PreDestroy  // for prototype bean spring doesn't call preDestroy method
    public void preDestroyMethod () {
        System.out.println("In preDestroyMethod... " + getClass().getSimpleName());
    }

    @Override
    public String getDailtyOrderCount() {
        return "100 Cake Today +++++++++++++" ;
    }
}
