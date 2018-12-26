package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Order {

    @Id
    private int id;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @OneToMany
    private List<Article> articles = new ArrayList<>();

    //TODO per artikel moet huidige prijs en aantal stuks bijgehouden worden

    @Column(name = "user")
    private User user;



}
