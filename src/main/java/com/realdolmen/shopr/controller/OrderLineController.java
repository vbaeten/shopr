package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.GameService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderLineController {

    @Inject
    private OrderLineService orderLineService;

    private ArticleService articleService;

    private OrderLine orderLine = new OrderLine();

    public String createOrderLine(Long id){
        this.orderLine.setArticle(articleService.findById(id));
        this.orderLine.setQuantity(orderLine.getQuantity());
        return "overview";
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLineService.findAllOrderLines();
    }

    public void add(OrderLine orderLine) {
        this.orderLineService.insert(orderLine);
    }

    public OrderLine getOrderLinebyId(Long id) {
        return orderLineService.findOrderLineById(id);
    }

    public String saveOrderLine() {
        this.orderLineService.insert(orderLine);
        return "overview";
    }

    public String removeOrderLine(OrderLine orderLine) {
        orderLineService.removeById(orderLine.getId());
        return "overview";
    }

    public OrderLine getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
