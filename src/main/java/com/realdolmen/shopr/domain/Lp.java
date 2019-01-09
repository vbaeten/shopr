package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Table(name = "LP")
@DiscriminatorValue("LP")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_BY_TITEL,
                        query = "SELECT u FROM Lp u WHERE u.Titel = :Titel"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT u FROM Lp u"
                )
        }
)
public class Lp extends Artikel{
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_TITEL = "Lp.findByTitel";

    private String UitvoerderTitel;

    private String Genre;

    public String getUitvoerderTitel() {
        return UitvoerderTitel;
    }

    public void setUitvoerderTitel(String uitvoerderTitel) {
        UitvoerderTitel = uitvoerderTitel;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
