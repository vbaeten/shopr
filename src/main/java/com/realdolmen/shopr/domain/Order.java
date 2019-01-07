package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int orderId;

    @Column(name = "order_date")
    private Timestamp orderDate;

//    @OneToMany
//    @JoinColumn(name = "id")
//    private List<Article> articles = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_fk")
    private User user;

    @OneToMany
    private List<OrderLine> orderLines = new ArrayList<>();

    public double calculateTotal (){
        double total = 0;
        for(OrderLine orderLine : orderLines) {
            total += orderLine.calculateSubtotal();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
