package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "game")
@DiscriminatorValue("game")
public class Game extends Product {

    @Column(length = 100, name = "editor")
    private String editor;

    @Column(name = "pegi_rating")
    private Integer pegiRating;

    @Enumerated
    private GameGenre genre;

    public String getEditor() {
        return editor;
    }

    public Game() {
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getPegiRating() {
        return pegiRating;
    }

    public void setPegiRating(Integer pegiRating) {
        this.pegiRating = pegiRating;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }
}
