package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class ShoppingCart implements Serializable {

    @Id
    private int id;

    @MapsId
    @OneToOne
    private User user;

    @OneToMany
    private List<OrderLine> orderLines;

    public ShoppingCart() {
    }

    public ShoppingCart(int id) {
        this.id = id;
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
