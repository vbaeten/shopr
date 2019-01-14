package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderController {

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;

    private List<OrderLine> orderLines = new ArrayList<>();




    public String placeOrder(){
        orderLines = orderLineService.getOrderLines();

        orderLines.clear();
        return "/overview-pages/thankyou-page.xhtml?faces-redirect=true";
    }

    public String backToHome(){
        return "/nav-pages/index.xhtml?faces-redirect=true";
    }



}
