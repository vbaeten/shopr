package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import static javax.persistence.DiscriminatorType.STRING;

@Entity
@DiscriminatorColumn(discriminatorType = STRING ,
        name = "type")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(@NamedQuery(name = Artikel.FIND_ALL_ARTIKELS,
        query = "select a from Artikel a"))

public class Artikel
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

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "artikel")
//    private List<Beoordeling> beoordeling;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getId()
    {
        return id;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public Integer getPrijs()
    {
        return prijs;
    }

    public void setPrijs(Integer prijs)
    {
        this.prijs = prijs;
    }

    public String getLeverancier()
    {
        return leverancier;
    }

    public void setLeverancier(String leverancier)
    {
        this.leverancier = leverancier;
    }
}
