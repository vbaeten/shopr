package com.realdolmen.shopr.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = Game.FIND_ALL,
                query = "select g from Game g"),
@NamedQuery(name= Game.FIND_BY_NAME,
query = "select g from Game g where g.titel=:titel")})

@DiscriminatorValue(value = "game")
@Getter
@Setter
public class Game extends Artikel
{

    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_NAME = "Game.findByTitel";


    @Size(max = 100)
    @Column
    private String uitgever;
    @Column
    private int minLeeftijd = 6;
    @Column
    @Enumerated(EnumType.STRING)
    private EnumGameGenre enumGameGenre;


}
