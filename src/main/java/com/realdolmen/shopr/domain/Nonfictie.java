package com.realdolmen.shopr.domain;

import javax.persistence.*;


@DiscriminatorValue(value = "nonFictie")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Nonfictie extends Boek
{
    @Column
    EnumNonFictieGenre enumNonFictieGenre;
    @Column
    public EnumNonFictieGenre getEnumNonFictieGenre()
    {
        return enumNonFictieGenre;
    }

    public void setEnumNonFictieGenre(EnumNonFictieGenre enumNonFictieGenre)
    {
        this.enumNonFictieGenre = enumNonFictieGenre;
    }
}
