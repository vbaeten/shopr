package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("fictie")
@NamedQueries(
        {
                @NamedQuery(
                        name = BoekFiction.FIND_BY_TITEL,
                        query = "SELECT u FROM BoekFiction u WHERE u.Titel = :Titel"
                ),
                @NamedQuery(
                        name = BoekFiction.FIND_ALL,
                        query = "SELECT u FROM BoekFiction u"
                )
        }
)
public class BoekFiction extends Boek {
    public static final String FIND_ALL = "BoekFiction.findAll";
    public static final String FIND_BY_TITEL = "BoekFiction.findByTitel";

    @Column
    private String Inhoud;
    @Enumerated(EnumType.STRING)
    protected BoekGenreFictie Boekgenrefictie;

    public String getInhoud() {
        return Inhoud;
    }

    public void setInhoud(String inhoud) {
        Inhoud = inhoud;
    }

    public BoekGenreFictie getBoekgenre() {
        return Boekgenrefictie;
    }

    public void setBoekgenre(BoekGenreFictie boekgenre) {
        Boekgenrefictie = boekgenre;
    }
}
