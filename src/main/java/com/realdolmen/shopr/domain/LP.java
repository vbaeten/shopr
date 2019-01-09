package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "lp")
@DiscriminatorValue("lp")
public class LP extends Product {

//    @Column(length = 100, name = "interpreter")
    private String interpreter;

    @Enumerated
    @Column(name = "lp_genre")
    private LPGenre lpGenre;

    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public LPGenre getLpGenre() {
        return lpGenre;
    }

    public void setLpGenre(LPGenre lpGenre) {
        this.lpGenre = lpGenre;
    }
}
