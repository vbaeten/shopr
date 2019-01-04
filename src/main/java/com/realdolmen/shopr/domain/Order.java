package com.realdolmen.shopr.domain;


import javax.jws.soap.SOAPBinding;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

public class Order {

    @Id
    @GeneratedValue
    private int id;

    private Timestamp date;

    @OneToMany
    private List<OrderLine> orderLines;

    private User user;


}
