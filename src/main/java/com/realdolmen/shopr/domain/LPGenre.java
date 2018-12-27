package com.realdolmen.shopr.domain;

public enum LPGenre {

    CLASSICAL ("Classical"),
    POP ("POP"),
    ROCK ("Rock"),
    DANCE ("Dance"),
    RNB ("R&B"),
    HIPHOP ("Hip-Hop");


    private final String genre;


    LPGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
