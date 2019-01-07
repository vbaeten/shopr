package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {

    @Id
    private int id;

    private int quantity;

    @ManyToOne
    @JoinColumn
    private Article article;

    @ManyToOne
    @JoinColumn(name="order_fk")
    private Order order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateSubtotal() {
        return article.getPrice() * quantity;
    }


}
