package com.realdolmen.shopr.domain;

public class Game extends Article {

    private String publisher;
    private short minAge;
    private GameGenre genre;



    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public short getMinAge() {
        return minAge;
    }

    public void setMinAge(short minAge) {
        this.minAge = minAge;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }
}
