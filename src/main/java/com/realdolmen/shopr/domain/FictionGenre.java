package com.realdolmen.shopr.domain;

public enum FictionGenre {
    thriller("Thriller"), fantasy("Fantasy"), detective("Detective"), romance("Romance"), sciFi("Sci-Fi");
    public String description;
    FictionGenre(String des){
        this.description = des;
    }
}
