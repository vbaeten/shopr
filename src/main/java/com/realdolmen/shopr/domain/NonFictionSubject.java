package com.realdolmen.shopr.domain;

public enum NonFictionSubject {
    history("History"), cookbook("Coockbook"), science("Science"), sports("Sports");
    public String description;
    NonFictionSubject(String des){
        this.description = des;
    }
}
