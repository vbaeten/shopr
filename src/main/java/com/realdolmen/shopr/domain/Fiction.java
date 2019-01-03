package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Fiction")
public class Fiction extends Book {
    @Enumerated(EnumType.STRING)
    @Column(name = "fiction_genre")
    private FictionGenre fictionGenre;
    private String summary;

    public FictionGenre getFictionGenre() {
        return fictionGenre;
    }

    public void setFictionGenre(FictionGenre fictionGenre) {
        this.fictionGenre = fictionGenre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
