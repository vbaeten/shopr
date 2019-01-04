package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.List;

public class OrderLine {


    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    private Item item;

}
