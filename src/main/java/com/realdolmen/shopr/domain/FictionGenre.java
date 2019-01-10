package com.realdolmen.shopr.domain;

public enum FictionGenre {
    THRILLER("thriller"),
    FANTASY("fantasy"),
    DETECTIVE("detective"),
    ROMANCE("romance"),
    SCIFI("sci-fi");

    private String fictionGenre;


    FictionGenre(String fictionGenre) {
        this.fictionGenre = fictionGenre;
    }


    public String getFictionGenre() {
        return fictionGenre;
    }

    public void setFictionGenre(String fictionGenre) {
        this.fictionGenre = fictionGenre;
    }
}
