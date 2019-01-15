package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "order_line")
@NamedQueries({
        @NamedQuery(
                name = OrderLine.FIND_ALL,
                query = "SELECT o FROM OrderLine o"
        )
})
public class OrderLine {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public static final String FIND_ALL = "OrderLine.findAll";


    @ManyToOne
    private Item item;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

    @Transient
    private double subTotal;
    private int quantity;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
