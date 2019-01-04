package com.realdolmen.shopr.domain;

public enum BookGenre {

    THRILLER("thriller"),
    FANTASY("Fantasy"),
    DETECTIVE("Detective"),
    ROMANCE("Romance"),
    SCIFI("Scifi");


    private final String genre;

    BookGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
