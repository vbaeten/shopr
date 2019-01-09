package com.realdolmen.shopr.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("nonFiction")
public class NonFiction extends Book {

    @Enumerated
    private NonFictionGenre nonFictionGenre;

    public NonFictionGenre getNonFictionGenre() {
        return nonFictionGenre;
    }

    public void setNonFictionGenre(NonFictionGenre nonFictionGenre) {
        this.nonFictionGenre = nonFictionGenre;
    }
}
