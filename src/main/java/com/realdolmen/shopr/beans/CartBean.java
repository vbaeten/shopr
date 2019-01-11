package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ShoppingCartService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class CartBean implements Serializable {

    private int id = 0;
    private User loggedUser;
    private ShoppingCart userShoppingCart = null;

    @Inject
    private ShoppingCartService shoppingCartService;
//
//    @PostConstruct
//    public void init(int id) {
//        userShoppingCart = shoppingCartService.findShoppingCartByUserId(id);
//    }

    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public void removeOrderLine(OrderLine orderLine) {
        orderLines.remove(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
