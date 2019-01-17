package com.realdolmen.shopr.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Beoordeling")
@NamedQueries({
        @NamedQuery(name = Beoordeling.FIND_ALL,
                query = "select b from Beoordeling b")})
@Getter
@Setter
public class Beoordeling
{

    public static final String FIND_ALL = "Beoordeling.findAll";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private int score = 3;
    @Column
    private String onschrijving;
    @ManyToOne
    private User user;
   @ManyToOne
   private Artikel artikel;




}
