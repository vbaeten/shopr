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
    OrderLine newOrderLine = new OrderLine();

    @Inject
    UserController userController;

    @Inject
    OrderService orderService;

    @Inject
    ArticleService articleService;

    public OrderLine getNewOrderLine() {
        return newOrderLine;
    }

    public void setNewOrderLine(OrderLine orderLine) {
        this.newOrderLine = orderLine;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order newOrder) {
        this.currentOrder = newOrder;
    }

    public void addOrderLine(int articleId){
        Article article = articleService.findById(articleId);
        List<OrderLine> orderLines = new ArrayList<>();
        boolean found = false;
        if (currentOrder.getOrderLines() != null){
            orderLines = currentOrder.getOrderLines();
            for (OrderLine line : orderLines){
                if (line.getArticle().getId() == articleId){
                    line.setAmount(line.getAmount() + newOrderLine.getAmount());
                    line.setSubTotal();
                    found = true;
                    newOrderLine = new OrderLine();
                }
            }
        }

        if (!found){
            newOrderLine.setArticle(article);
            currentOrder.addOrderLine(newOrderLine);
            newOrderLine = new OrderLine();
        }
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

    public void deleteOrderLine(int id){
        this.currentOrder.getOrderLines().remove(id);
    }

}
