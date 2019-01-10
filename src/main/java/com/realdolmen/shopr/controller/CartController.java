package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.Product;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.ProductService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class CartController {

    private List<OrderLine> orderLines = new ArrayList<>();
    private OrderLine orderLine;
    private Product product;
    private Integer quantity;

    @Inject
    private ProductService productService;

    @Inject
    private OrderService orderService;

    public void buy(Long productId) {
        product = this.productService.findById(productId);
        for(int i = 0; i < orderLines.size(); i++) {
            if(orderLines.get(i).equals(productId)) {
                orderLine.getProduct();
                orderLine.setQuantity(quantity++);
            }
        }
        orderLines.add(orderLine);
    }

    public void save() {
        this.orderService.insert(orderLine);
    }

    public double subTotal(OrderLine orderLine) {
        double total = 0;
        total = (orderLine.getQuantity() * orderLine.getProduct().getPrice());

        return  total;
    }

    public double total() {
        double total = 0;
        for(OrderLine orderLine : orderLines) {
            total = subTotal(orderLine);
        }
        return total;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
