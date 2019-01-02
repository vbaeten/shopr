package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "non_fiction")
@NamedQueries(
        @NamedQuery(
                name = NonFiction.FIND_ALL,
                query = "SELECT a FROM NonFiction a"
        )
)
public class NonFiction extends Book {

    public static final String FIND_ALL = "FonFiction.findAll";

    @Column(name = "genre")
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
