package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bestellingen")
public class Bestelling
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Date bestelDatum;

    //    @OneToMany
//    @JoinColumn(name = "order_id")
//    private List<Artikel> artikels = new ArrayList<>();
    @ManyToOne
    User user;

}
