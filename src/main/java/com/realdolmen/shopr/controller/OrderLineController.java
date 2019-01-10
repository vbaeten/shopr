package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderLineController {

    @Inject
    private OrderLineService orderLineService;
    @Inject
    private LoginController loginController;
    @Inject
    private ArticleController articleController;
    @Inject
    private OrderController orderController;

    private Article article;
    private OrderLine orderLine = new OrderLine();
    private Order newOrder = new Order();


    public OrderLine findById(int id) {
        return orderLineService.findById(id);
    }

    public List<OrderLine> findAll() {
        return orderLineService.findAllOrders();
    }

    public List<OrderLine> findByOrderId(int id) {
        return orderLineService.findByOrderId(id);
    }

    public void insert(OrderLine orderLine) {
        orderLineService.insert(orderLine);
    }

    public void removeById(int id) {
        orderLineService.removeById(id);
    }

    public String submitQuantity(BigDecimal quantity, int articleId, int userId) {
        this.orderLine.setArticle(articleController.getArticleById(articleId));
        this.orderLine.setQuantity(quantity);
        this.orderLine.setSubTotal(orderLine.getArticle().getPrice().multiply(quantity));
        if (this.orderLine.getOrder() == null) {
            this.orderLine.setOrder(newOrder);
            newOrder.setUser(loginController.getSelectedUser());
            newOrder.getUser().setId(userId);
            orderController.setSelectedOrder(newOrder);
            orderController.setCurrentUser(loginController.getSelectedUser());
            orderController.getCurrentUser().setId(userId);
        }
//        articleController.getOrderLines().add(this.orderLine);
//        orderController.getOrderLines().add(this.orderLine);
        return "shoppingCart?faces-redirect=true&include-viewParams=true";
    }


    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Order getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(Order newOrder) {
        this.newOrder = newOrder;
    }
}
