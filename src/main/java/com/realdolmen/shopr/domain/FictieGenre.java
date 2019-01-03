package com.realdolmen.shopr.domain;

import java.beans.Transient;

public enum FictieGenre {
    THRILLER("thriller"),
    FANTASY("fantasy"),
    DETECTIVE("detective"),
    ROMANCE("romance"),
    SCIFI("sci-fi");

    private String fictieGenre;

    FictieGenre(String fictieGenre) {
        this.fictieGenre = fictieGenre;
    }

    public String getFictieGenre() {
        return fictieGenre;
    }

    public void setFictieGenre(String fictieGenre) {
        this.fictieGenre = fictieGenre;
    }
}
