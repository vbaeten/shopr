package com.realdolmen.shopr.domain;


import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;



public class Order {

    @Id
    @GeneratedValue
    private int id;

    private Timestamp date;

    @OneToMany
    private List<OrderLine> orderLines;

    @ManyToOne
    @JoinColumn
    private User user;









    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
