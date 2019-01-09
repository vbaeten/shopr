package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
public class OrderLineController implements Serializable {

    @Inject
    private OrderLineService orderLineService;

    @Inject
    private ArticleService articleService;

    private OrderLine orderLine;
    private int quantity;
    private double subtotal;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addToCart(int id, int quantity) {
        orderLine = new OrderLine();
        this.orderLine.setQuantity(quantity);
        this.orderLine.setArticle(articleService.findArticleById(id));
        orderLineService.insertOrderLine(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLineService.findAllOrderLines();
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
