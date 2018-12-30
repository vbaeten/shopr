package com.realdolmen.shopr.domain;

public enum GameGenre {
    MMORPG("MMORPG"), RPG("RPG"), FPS("FPS"), RTS("RTS"), RACE("Race");
    public String description;
    GameGenre(String des){
        this.description = des;
    }
}
