package com.realdolmen.shopr.domain;

public enum GameGenre {

    MMORPG("MMORPG"),
    RPG("RPG"),
    FPS("FPS"),
    RTS("RTS"),
    RACE("Race");


    private final String genre;

    GameGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
