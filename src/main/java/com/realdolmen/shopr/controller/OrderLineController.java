package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
public class OrderLineController implements Serializable {

    private OrderLine orderLine;


    @Inject
    private OrderLineService orderLineService;

    @Inject
    private ArticleService articleService;

    public void addToCart(int id) {
        orderLine.setArticle(articleService.findArticleById(id));
        orderLineService.insertOrderLine(orderLine);
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
