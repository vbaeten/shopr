package com.realdolmen.shopr.domain;

public enum LpGenre {
    KLASSIEK("klassiek"),
    POP("pop"),
    ROCK("rock"),
    DANCE("dance"),
    RNB("r&b"),
    HIPHOP("hiphop");

    private String lpGenre;

    LpGenre(String lpGenre) {
        this.lpGenre = lpGenre;
    }

    public String getLpGenre() {
        return lpGenre;
    }

    public void setLpGenre(String lpGenre) {
        this.lpGenre = lpGenre;
    }

}
