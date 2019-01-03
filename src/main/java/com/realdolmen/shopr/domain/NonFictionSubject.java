package com.realdolmen.shopr.domain;

public enum NonFictionSubject {
    HISTORY ("History"),
    COOKBOOK ("Cookery Book"),
    SCIENCE ("Science"),
    SPORTS ("Sports");

    private final String name;

    NonFictionSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
