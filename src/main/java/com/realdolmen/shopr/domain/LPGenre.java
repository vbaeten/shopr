package com.realdolmen.shopr.domain;

public enum LPGenre {
    CLASSICAL ("Classical"),
    POP ("Pop"),
    ROCK ("Rock"),
    ELECTRONIC ("Electronic"),
    JAZZ ("Jazz"),
    HIPHOP ("Hip Hop");

    private final String name;

    LPGenre(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
