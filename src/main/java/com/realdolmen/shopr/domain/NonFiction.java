package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class NonFiction extends Book {

    @Enumerated
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
