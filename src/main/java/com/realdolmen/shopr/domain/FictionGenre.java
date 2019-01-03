package com.realdolmen.shopr.domain;

public enum FictionGenre {
    THRILLER ("Thriller"),
    FANTASY ("Fantasy"),
    DETECTIVE ("Detective"),
    ROMANCE ("Romance"),
    SCIFI ("Sci-Fi");

    private final String name;

    FictionGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
