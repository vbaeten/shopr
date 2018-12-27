package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lp"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"uitvoerder", "titel"})*/)
public class Lp extends Artikel {

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
