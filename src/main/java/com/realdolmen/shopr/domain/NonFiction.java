package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "non_fiction")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class NonFiction extends Book {

    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
