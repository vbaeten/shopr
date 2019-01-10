package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderLineService;

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

    private ArrayList<OrderLine> sessionOrderLines = new ArrayList<>();

    @Inject
    private OrderLineService orderLineService;

    private ArticleService articleService;

    private Article selectedArticle;

    public Article getSelectedArticle() {
        return selectedArticle;
    }

    public void setSelectedArticle(Article selectedArticle) {
        this.selectedArticle = selectedArticle;
    }

    private OrderLine orderLine = new OrderLine();

    public void initDetailView(Long orderlineId) {
        this.orderLine = orderLineService.findOrderLineById(orderlineId);
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
            System.out.println("bestaat al");
        }
        return "orderlineselected";
    }
    public ArrayList<OrderLine> getSessionOrderLines() {
        return sessionOrderLines;
    }

    public void setSessionOrderLines(ArrayList<OrderLine> sessionOrderLines) {
        this.sessionOrderLines = sessionOrderLines;
    }


    public List<OrderLine> getOrderLines() {
        return this.orderLineService.findAllOrderLines();
    }

    public void add(OrderLine orderLine) {
        this.orderLineService.insert(orderLine);
    }

    public OrderLine getOrderLinebyId(Long orderlineId) {
        return orderLineService.findOrderLineById(orderlineId);
    }

    public String removeOrderLine(OrderLine orderLine) {
        orderLineService.removeByOrderlineId(orderLine.getOrderlineId());
        return "overview";
    }

    public OrderLine getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
