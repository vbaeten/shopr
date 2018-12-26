package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(
        name = "LP",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"title", "interpreter"})}
)
public class LP extends Product {

    @Column(length = 100, name = "interpreter")
    private String Interpreter;

    private LPGenre genre;

    public String getInterpreter() {
        return Interpreter;
    }

    public void setInterpreter(String interpreter) {
        Interpreter = interpreter;
    }

    public LPGenre getGenre() {
        return genre;
    }

    public void setGenre(LPGenre genre) {
        this.genre = genre;
    }
}
