package com.realdolmen.shopr.domain;



public class LP extends Article {

    private String publisher;
    private LPGenre genre;


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LPGenre getGenre() {
        return genre;
    }

    public void setGenre(LPGenre genre) {
        this.genre = genre;
    }
}
