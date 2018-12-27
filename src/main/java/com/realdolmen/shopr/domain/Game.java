package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Table(name = "Game")
@DiscriminatorValue("game")
@Inheritance(strategy = InheritanceType.JOINED)
public class Game extends Artikel{
    @Column
    private String Uitgever;
    @Column
    private int MinimumAge;
    @Column
    private String Genre;


}
