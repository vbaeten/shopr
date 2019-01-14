package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.util.ShoprEndpoints;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ManagedBean
@SessionScoped
public class OrderLineController {

    private OrderLine orderLine = new OrderLine();

    private List<OrderLine> sessionOrderLines = new ArrayList<>();

    private Article selectedArticle;

    private BigDecimal totalPrice;

    @Inject
    private OrderLineService orderLineService;

    public String reset(){
        this.sessionOrderLines.clear();
        return ShoprEndpoints.OVERVIEW;
    }

    public String continueShopping (){
        return ShoprEndpoints.OVERVIEW;
    }

    public String placeOrder(List<OrderLine> sessionOrderLines){
        if (sessionOrderLines.size() > 0) {
            return "ordercreated";
        } else {
            return "emptyshoppingcart";
        }
    }

    public BigDecimal displayTotalPrice(){
        this.totalPrice = orderLineService.calculateTotalPrice(sessionOrderLines);
        return totalPrice;
    }

    public String createOrderLine(BigDecimal quantity, Article article) {
        Optional<OrderLine> orderLine = sessionOrderLines.stream()
                .filter(orderLine1 -> orderLine1.getArticle().getArticleId().equals(article.getArticleId())).findAny();
        if(!orderLine.isPresent()){
            OrderLine newOrderline = new OrderLine();
            newOrderline.setArticle(article);
            newOrderline.setQuantity(quantity);
            newOrderline.setSubTotal(orderLineService.calculateSubtotal(quantity, article.getPrice()));
            sessionOrderLines.add(newOrderline);
        }else{
           orderLine.ifPresent(orderLine1 -> orderLine1.setQuantity(orderLine1.getQuantity().add(quantity)));
        }
        return ShoprEndpoints.SHOPPING_CART;
    }

    public void add(OrderLine orderLine) {
        this.orderLineService.insert(orderLine);
    }

    public OrderLine getOrderLinebyId(Long orderlineId) {
        return orderLineService.findByPrimaryKey(orderlineId);
    }

    public String removeOrderLine(OrderLine orderLine) {
        orderLineService.remove(orderLine);
        return ShoprEndpoints.OVERVIEW;
    }

    public OrderLine getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Article getSelectedArticle() {
        return selectedArticle;
    }

    public void setSelectedArticle(Article selectedArticle) {
        this.selectedArticle = selectedArticle;
    }
    public List<OrderLine> getSessionOrderLines() {
        return sessionOrderLines;
    }

    public void setSessionOrderLines(ArrayList<OrderLine> sessionOrderLines) {
        this.sessionOrderLines = sessionOrderLines;
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLineService.findAll();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
