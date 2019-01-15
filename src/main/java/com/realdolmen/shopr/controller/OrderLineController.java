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
    private int toShowId;
    private Order persistedOrder;
    private static  final SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd.HH.mm.ss");

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





    public void addToCart(int itemId){

        orderLine = new OrderLine();
        item = itemService.getById(itemId);
        orderLine.setItem(item);
        orderLine.setQuantity(quantity);
        double orderLineTotal = orderLine.getQuantity() * orderLine.getItem().getPrice();
        orderLine.setSubTotal(orderLineTotal);
        orderLines.add(orderLine);
        this.orderLineService.submit(orderLine);
        order.setOrderLines(orderLines);
        orderLine.setOrder(order);
        orderLine = new OrderLine();
    }


    public String placeOrder(){

        try {

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            order.setDate(timestamp);
            order.setOrderLines(orderLines);
            int id = userController.getCurrentUser().getId();
            User userById = userService.getUserById(id);
            order.setUser(userById);
            order.setTotalPrice(calcTotalPrice());
            persistedOrder =  orderService.submitOrder(order);
            orderLines.clear();
            toShowId = persistedOrder.getId();
            order = new Order();
            return "/overview-pages/thankyou-page.xhtml?faces-redirect=true";
        }catch(Exception e){
            return "/nav-pages/index.xhtml?faces-redirect=true";
        }
    }


    public String backToHome(){
        return "/nav-pages/index.xhtml?faces-redirect=true";
    }


    public Order findOrderById(){

        return orderService.findById(toShowId);
    }

    public Double calcTotalPrice(){
        double totalPrice = 0;
        for (int i =0; i<orderLines.size();i++){
            totalPrice = totalPrice +(orderLines.get(i).getSubTotal());
        }
        return totalPrice;
    }



    public List<OrderLine> getOrderLines(){
        return this.orderLineService.getOrderLines();
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getToShowId() {
        return toShowId;
    }

    public void setToShowId(int toShowId) {
        this.toShowId = toShowId;
    }
}
