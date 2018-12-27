package com.realdolmen.shopr.domain;

public enum LpGenre {
    CLASSICAL ("Classical"),
    POP ("Pop"),
    ROCK ("Rock"),
    ELECTRONIC ("Electronic"),
    JAZZ ("Jazz"),
    HIPHOP ("Hip Hop");

    private final String name;

    LpGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
