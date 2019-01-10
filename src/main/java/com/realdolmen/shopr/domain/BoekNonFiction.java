package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Non-fictie")
@NamedQueries(
        {
                @NamedQuery(
                        name = BoekNonFiction.FIND_BY_TITEL,
                        query = "SELECT u FROM BoekNonFiction u WHERE u.Titel = :Titel"
                ),
                @NamedQuery(
                        name = BoekNonFiction.FIND_ALL,
                        query = "SELECT u FROM BoekNonFiction u"
                )
        }
)
public class BoekNonFiction extends Boek {
    public static final String FIND_ALL = "BoekNonFiction.findAll";
    public static final String FIND_BY_TITEL = "BoekNonFiction.findByTitel";



    @Enumerated(EnumType.STRING)
    protected BoekGenreNonFictie Boekgenrenonfictie;

    public BoekGenreNonFictie getBoekgenre() {
        return Boekgenrenonfictie;
    }

    public void setBoekgenre(BoekGenreNonFictie boeknongenre) {
        Boekgenrenonfictie = boeknongenre;
    }
}
