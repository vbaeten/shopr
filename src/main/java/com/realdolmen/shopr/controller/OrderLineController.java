package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class OrderLineController implements Serializable {


    private Order order = new Order();
    private Item item;
    private OrderLine orderLine;
    private short quantity;
    private List<OrderLine> orderLines = new ArrayList<>();
    private static  final SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd.HH.mm.ss");
    private Timestamp timestamp;

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;
    @Inject
    private UserController userController;
    @Inject
    private UserService userService;


    public List<OrderLine> getOrderLines(){
        return this.orderLineService.getOrderLines();
    }


    public void addToCart(int itemId){

        orderLine = new OrderLine();
        item = itemService.getById(itemId);
        orderLine.setItem(item);
        orderLine.setOrder(order);
        orderLine.setQuantity(quantity);
        orderLines.add(orderLine);
        this.orderLineService.submit(orderLine);
        order.setOrderLines(orderLines);
        orderLine = new OrderLine();
    }


    public String placeOrder(){

        timestamp=new Timestamp(System.currentTimeMillis());
        orderService.checkForUser();
        order = new Order();
        order.setDate(timestamp);
        order.setOrderLines(orderLines);
        int id = userController.getCurrentUser().getId();
        User userById = userService.getUserById(id);
        order.setUser(userById);
        orderService.submitOrder(order);
        order.getOrderLines().clear();
        return "/overview-pages/thankyou-page.xhtml?faces-redirect=true";
    }

    public String backToHome(){
        return "/nav-pages/index.xhtml?faces-redirect=true";
    }



    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
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

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
