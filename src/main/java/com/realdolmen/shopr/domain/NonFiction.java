package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "non_fiction")
@NamedQueries(
        @NamedQuery(
                name = NonFiction.FIND_ALL,
                query = "SELECT a FROM NonFiction a"
        )
)
public class NonFiction extends Book implements Serializable {

    public static final String FIND_ALL = "NonFiction.findAll";

    @Column(name = "subject")
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
