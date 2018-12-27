package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class NonFiction extends Book {
    @Enumerated(EnumType.STRING)
    private NonFictionSubject subject;

    public NonFictionSubject getSubject() {
        return subject;
    }

    public void setSubject(NonFictionSubject subject) {
        this.subject = subject;
    }
}
