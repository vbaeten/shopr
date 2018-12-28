package com.realdolmen.shopr.domain;

public enum LPGenre {

    CLASSICAL ("Classical"),
    POP ("POP"),
    ROCK ("Rock"),
    DANCE ("Dance"),
    RNB ("R&B"),
    HIPHOP ("Hip-Hop");


    private final String name;


    LPGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
