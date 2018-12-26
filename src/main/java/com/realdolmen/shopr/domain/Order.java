package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany
    private Article article;

}
