package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Artikel
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @NotNull
    @Size(min=1,max=100)
    @Column
    private String titel;
    @NotNull
    @Column
    private Integer prijs;
    @NotNull
    @Size(min=1,max=100)
    @Column
    private String leverancier;


    public Long getId()
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
