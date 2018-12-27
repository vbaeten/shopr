package com.realdolmen.shopr.domain;

public enum BookGenre {
    THRILLER ("Thriller"),
    FANTASY ("Fantasy"),
    DETECTIVE ("Detective"),
    ROMANCE ("Romance"),
    SCIFI ("Sci-Fi");

    private final String name;

    BookGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
