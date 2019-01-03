package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "non_fiction")
@DiscriminatorValue("Non fiction")
public class NonFiction extends Book {
    @Enumerated(EnumType.STRING)
    @Column(name = "nonfiction_subject")
    private NonFictionSubject nonFictionSubject;

    public NonFictionSubject getNonFictionSubject() {
        return nonFictionSubject;
    }

    public void setNonFictionSubject(NonFictionSubject nonFictionSubject) {
        this.nonFictionSubject = nonFictionSubject;
    }
}
