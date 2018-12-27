package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Timestamp date;

    @Column
    @OneToMany
    private List<Article> articles;



}
