package com.realdolmen.shopr.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

// TODO: waarom geen primefaces icons in commandbuttons?
// TODO: op artikeldetail: aantal default op 1 zetten
// TODO: bij overzicht winkelmandje: delete knop geeft altijd 0 mee als id
// TODO: bij overzicht winkelmandje: edit knop implementeren
// TODO:
// TODO:

@Entity
@Table(name="orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "time_stamp")
    private Timestamp timeStamp;

    @OneToMany(mappedBy = "order", cascade={CascadeType.PERSIST,  CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<OrderLine> orderLines = new ArrayList<>();

    @ManyToOne
    private User user;

    @Transient
    private double price = 0D;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }



    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLine) {
        this.orderLines = orderLine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        this.setPrice();
        return price;
    }

    public void setPrice() {
        if (this.getOrderLines() != null && this.getOrderLines().size() > 0) {
            double tempPrice = 0;
            for (OrderLine orderLine : this.getOrderLines()) {
                tempPrice += orderLine.getSubTotal();
            }
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            this.price = Double.parseDouble(df.format(tempPrice));
        }
    }

    public void addOrderLine(OrderLine orderLine){
        orderLine.setOrder(this);
        this.orderLines.add(orderLine);
    }

    public int getTotalNumberOfArticles(){
        int number = 0;
        if (orderLines != null){
            for (OrderLine line: orderLines){
                number += line.getAmount();
            }
        }
        return number;
    }

    public int getNumberOfDifferentArticles(){
        if (orderLines != null){
            return orderLines.size();
        }
        else {
            return 0;
        }
    }

}
