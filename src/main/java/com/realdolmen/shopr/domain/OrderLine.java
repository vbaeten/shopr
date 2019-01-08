package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.List;



public class OrderLine {


    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    private Item item;

    @OneToMany
    private Order order;






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
