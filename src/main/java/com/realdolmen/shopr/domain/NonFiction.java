package com.realdolmen.shopr.domain;

import javax.persistence.Column;

public class NonFiction extends Book {


    @Column(name = "genre")
    private Subject subject;

}
