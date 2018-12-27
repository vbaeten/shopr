package com.realdolmen.shopr.domain;

import javax.persistence.Entity;

@Entity
public class NonFiction extends Book {

    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
