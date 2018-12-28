package com.realdolmen.shopr.domain;

public enum GameGenre {

    MMORPG("MMORPG"),
    RPG("RPG"),
    FPS("FPS"),
    RTS("RTS"),
    RACE("Race");


    private final String name;


    GameGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
