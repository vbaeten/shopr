package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean
public class OrderController {
    Order currentOrder = new Order();
    private int newAmount;

    @Inject
    UserController userController;

    @Inject
    OrderService orderService;

    @Inject
    OrderLineController orderLineController;

    @Inject
    ArticleService articleService;

    public int getNewAmount() {
        return newAmount;
    }

    public void setNewAmount(int newAmount) {
        this.newAmount = newAmount;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order newOrder) {
        this.currentOrder = newOrder;
    }

    public void addOrderLine(int articleId, int amount){
        Article article = articleService.findById(articleId);
        List<OrderLine> orderLines = new ArrayList<>();
        boolean found = false;
        if (currentOrder.getOrderLines() != null){
            orderLines = currentOrder.getOrderLines();
            for (OrderLine orderLine : orderLines){
                if (orderLine.getArticle().getId() == articleId){
                    orderLine.setAmount(orderLine.getAmount() + amount);
                    orderLine.setSubTotal();
                    found = true;
                }
            }
        }

        if (!found){
            OrderLine orderLine = orderLineController.getNewOrderLine();
            orderLine.setArticle(article);
            orderLine.setAmount(amount);
            orderLine.setSubTotal();
            currentOrder.addOrderLine(orderLine);
        }
        System.out.println("article: " + article.getTitle());
        System.out.println("amount: " + amount);
        System.out.println(currentOrder.getOrderLines().size());
    }

    public String submit(){
        LocalDateTime now = LocalDateTime.now();
        Timestamp orderTime = Timestamp.valueOf(now);
        this.currentOrder.setTimeStamp(orderTime);
        this.currentOrder.setUser(userController.getCurrentUser());
        this.orderService.insert(currentOrder);
        currentOrder = new Order();
        return "orderConfirmed?faces-redirect=true";
    }

}
