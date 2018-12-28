package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "non_fiction")
public class NonFiction extends Book {


    @Column(name = "genre")
    private Subject subject;

}
