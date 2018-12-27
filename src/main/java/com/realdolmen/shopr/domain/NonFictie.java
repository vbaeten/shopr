package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "non-fictie")
public class NonFictie extends Boek {

    @Enumerated(EnumType.STRING)
    private NonFictieOnderwerp nonFictieOnderwerp;

    public NonFictieOnderwerp getNonFictieOnderwerp() {
        return nonFictieOnderwerp;
    }

    public void setNonFictieOnderwerp(NonFictieOnderwerp nonFictieOnderwerp) {
        this.nonFictieOnderwerp = nonFictieOnderwerp;
    }
}
