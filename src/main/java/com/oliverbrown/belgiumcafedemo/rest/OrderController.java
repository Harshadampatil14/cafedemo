package com.oliverbrown.belgiumcafedemo.rest;

import com.oliverbrown.belgiumcafedemo.common.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private Order myOrder;
    private Order myAnotherOrder;

    //Constructor injection
  //  @Autowired
   public OrderController(@Qualifier("coffee") Order thisOrder
                         ) {
   //public OrderController(Order thisOrder) {
       System.out.println("In class " + getClass().getSimpleName());
        this.myOrder = thisOrder;
    }
    /* setter Injection
@Autowired
    public void doSomeStuff(Order thisCustomer) {
        this.myOrder = thisCustomer;
    }  */
    /* Example by default beans are Singleton
    * return false if bean declare with @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
   /* public OrderController(@Qualifier("orderCake") Order thisOrder,
                           @Qualifier("orderCake") Order thisAnoterOrder) {
        // public OrderController(Order thisOrder) {
        System.out.println("In class " + getClass().getSimpleName());
        myOrder = thisOrder;
        myAnotherOrder = thisAnoterOrder;
    }*/
@GetMapping("/orderCount")
    public String getDailyWorkout () {
     return myOrder.getDailtyOrderCount();
    }

  /*  @GetMapping("/check")
    public String getCheck () {
        return "(myOrder == myAnotherOrder) " + (myOrder == myAnotherOrder) ;
    }
*/
}
