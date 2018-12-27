package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    private int id;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Article> articles = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

}
