package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class NonFiction extends Book {
    private NonFictionSubject subject;

    public NonFictionSubject getSubject() {
        return subject;
    }

    public void setSubject(NonFictionSubject subject) {
        this.subject = subject;
    }
}
