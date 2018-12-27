package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class NonFiction extends Book {


    @Column(name = "genre")
    private Subject subject;

}
