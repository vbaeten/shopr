package com.realdolmen.shopr.service;

import com.realdolmen.shopr.controller.UserController;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;

@Stateless
public class OrderService implements Serializable {

    @Inject
    UserController userController;


    @Inject
    private OrderRepository orderRepository;

    public void submitOrder(Order order) {

        this.orderRepository.submitOrder(order);

    }


    public String checkForUser() {
        if(!isLoggedIn()){

            return "/nav-pages/index.xhtml?faces-redirect=true";
        }return "/nav-pages/thankyou-page.xhtml";
    }

    private Boolean isLoggedIn() {
        if (userController.getCurrentUser()==null){
            return false;
        }
        return true;
    }


}
