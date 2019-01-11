package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.exception.NotFoundException;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@ManagedBean
@SessionScoped
public class OrderLineController {

    @Inject
    private OrderLineService orderLineService;
    @ManagedProperty(value = "#{loginController}")
    private LoginController loginController ;
    @Inject
    private ArticleController articleController;
    @Inject
    private OrderService orderService;

    private Article article;
    private OrderLine orderLine = new OrderLine() ;
    private Order order;

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

    public String submitQuantity(Article article, BigDecimal quantity, Order order) {
        createNewOrderline(article, quantity, order);

        return "shoppingCart?faces-redirect=true";
    }

    private void createNewOrderline(Article article, BigDecimal quantity, Order order) {
        OrderLine orderLine = new OrderLine(article, quantity, order);
        this.setOrderLine(orderLine);
        this.orderLine.setSubTotal(article.getPrice().multiply(quantity));
        insert(orderLine);
    }

    public void buy(){
        orderLine.getOrder().setConfirmed(true);
        orderService.update(orderLine.getOrder());
        createNewOrder();
//        return "articleOverview?faces-redirect=true";
    }

    private void createNewOrder(){
        Order newOrder = new Order(loginController.getSelectedUser());
        orderService.insert(newOrder);
        List<Order> orderList = orderService.findOrdersByUserId(loginController.getSelectedUser().getId());
        Order unconfirmedOrder = orderList.stream().filter(order1 -> !order1.isConfirmed()).findFirst().orElseThrow(NotFoundException::new);
        loginController.setCurrentOrder(unconfirmedOrder);
    }



//               if (this.orderLine.getOrder() == null) {
//        this.setOrderLine(new OrderLine(articleController.getArticleById(articleId), quantity, ));
//        this.orderLine.setArticle(articleController.getArticleById(articleId));
//        this.orderLine.setQuantity(quantity);
//        this.orderLine.setSubTotal(orderLine.getArticle().getPrice().multiply(quantity));
//
//            this.orderLine.setOrder(order);
//            order.setUser(loginController.getSelectedUser());
//            order.getUser().setId(userId);
//            orderController.setSelectedOrder(order);
//            orderController.setCurrentUser(loginController.getSelectedUser());
//            orderController.getCurrentUser().setId(userId);
//        }
//        articleController.getOrderLines().add(this.orderLine);
//        orderController.getOrderLines().add(this.orderLine);
//        return "shoppingCart?faces-redirect=true&include-viewParams=true";
//    }


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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
}
