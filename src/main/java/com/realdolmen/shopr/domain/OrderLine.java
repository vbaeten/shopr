package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "order_line")
public class OrderLine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Item item;

    @Transient
    private Order order;

    private int quantity;






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
