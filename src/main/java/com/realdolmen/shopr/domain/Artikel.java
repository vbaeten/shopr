package com.realdolmen.shopr.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static javax.persistence.DiscriminatorType.STRING;

@Entity
@DiscriminatorColumn(discriminatorType = STRING ,
        name = "type")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(@NamedQuery(name = Artikel.FIND_ALL_ARTIKELS,
        query = "select a from Artikel a"))
@Data
public class Artikel implements Serializable
{
    public static final String FIND_ALL_ARTIKELS = "Artikel.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @NotNull
    @Size(min = 1, max = 100)
    @Column
    private String titel;
    @NotNull
    @Column
    @Digits(integer = 6, fraction = 2)
    private Integer prijs;
    @NotNull
    @Size(min = 1, max = 100)
    @Column
    private String leverancier;

    @Column(insertable = false, updatable = false)
    private String type;



}
