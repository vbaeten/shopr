package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// TODO: growl message met bevestiging van bestelling bij "add-item-to-shopping-cart" button
// TODO: confirm dialog bij delete button -> backend moet nog message meegeven voor de growl message
// TODO: waarom geen primefaces icons in commandbuttons?
// TODO: op artikeldetail: aantal default op 1 zetten
// TODO: bij overzicht winkelmandje: delete knop geeft altijd 0 mee als id
// TODO: bij overzicht winkelmandje: edit knop implementeren
// TODO:
// TODO:

@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Column(name = "time_stamp")
//    private Timestamp timeStamp;

    @OneToMany(mappedBy = "orderId")
    private List<OrderLine> orderLines = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Transient
    private double price = 0D;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//
//    public Timestamp getTimeStamp() {
//        return timeStamp;
//    }
//
//    public void setTimeStamp(Timestamp timeStamp) {
//        this.timeStamp = timeStamp;
//    }

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
            this.price = tempPrice;
        }
    }

    public void addOrderLine(OrderLine orderLine){
        this.orderLines.add(orderLine);
    }

}
