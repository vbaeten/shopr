package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private Date orderDate;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "OrderProducts",
//            joinColumns = { @JoinColumn(name = "order_id", referencedColumnName = "id") },
//            inverseJoinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") })
//    private List<Product> products;

    @OneToMany
    private List<OrderLine> orderLine;

    @ManyToOne
    private User user;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
