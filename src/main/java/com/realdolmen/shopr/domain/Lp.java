package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lp"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"uitvoerder", "titel"})*/)
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_BY_GENRE,
                        query = "SELECT l FROM Lp l WHERE l.lpGenre = :lpGenre"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT l FROM Lp l"
                )
        }
)
public class Lp extends Artikel {
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_GENRE = "Lp.findByGenre";

    @Size(max = 100)
    @Column(name = "uitvoerder", unique = true)
    private String uitvoerder;

    @Enumerated(EnumType.STRING)
    private LpGenre lpGenre;

    public String getUitvoerder() {
        return uitvoerder;
    }

    public void setUitvoerder(String uitvoerder) {
        this.uitvoerder = uitvoerder;
    }

    public LpGenre getLpGenre() {
        return lpGenre;
    }

    public void setLpGenre(LpGenre lpGenre) {
        this.lpGenre = lpGenre;
    }
}
