package com.realdolmen.shopr.domain;

public enum GameGenre {
    MMORPG("MMO/RPG"),
    RPG("RPG"),
    FPS("FPS"),
    RTS("RTS"),
    RACE("Race");

    private String gameGenre;


    GameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }


    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }
}
