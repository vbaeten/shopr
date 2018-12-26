package com.realdolmen.shopr.domain;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Order {

    @Id
    private int id;
    private Timestamp dateOfOrder;

    private Article article;
    private User user;

    @OneToMany
    private List<Article> articles;
    private double articlePrice = article.getPrice();
    private short amount;




}
