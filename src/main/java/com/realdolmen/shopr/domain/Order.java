package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@NamedQueries(
        {
                @NamedQuery(
                        name = Order.FIND_ALL,
                        query = "SELECT o from Order o"
                ),
                @NamedQuery(
                        name = Order.FIND_BY_USER,
                        query = "SELECT o FROM Order o WHERE o.user = :user"
                )
        }
)
public class Order implements Serializable {

    public static final String FIND_ALL = "Order.findAll";
    public static final String FIND_BY_USER = "Order.findByUser";

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderLine> orderLines = new ArrayList<>();

    private double total;

    public double getTotal() {
        double total = 0;
        for (OrderLine orderLine : orderLines) {
            double subTotal = orderLine.getSubTotal();
            total += subTotal;
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
