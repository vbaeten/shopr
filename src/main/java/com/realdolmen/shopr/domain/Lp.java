package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = Lp.FIND_ALL,
                query = "select l from Lp l"),
        @NamedQuery(name= Lp.FIND_BY_NAME,
                query = "select l from Lp l where l.titel=:titel")})
@Table(name = "LP")
@DiscriminatorValue(value = "lp")
public class Lp extends Artikel
{
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_NAME = "Lp.findByTitel";

    @Size(max=100)
    @NotNull
    @Column
    private String uitvoerder;
    @NotNull
@Column
    @Enumerated(EnumType.STRING)
    EnumMuziekGenre enumMuziekGenre;

    public String getUitvoerder()
    {
        return uitvoerder;
    }

    public void setUitvoerder(String uitvoerder)
    {
        this.uitvoerder = uitvoerder;
    }

    public EnumMuziekGenre getEnumMuziekGenre()
    {
        return enumMuziekGenre;
    }

    public void setEnumMuziekGenre(EnumMuziekGenre enumMuziekGenre)
    {
        this.enumMuziekGenre = enumMuziekGenre;
    }
}
