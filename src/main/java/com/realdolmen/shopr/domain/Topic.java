package com.realdolmen.shopr.domain;

public enum Topic {
    HISTORY ("History"),
    COOKBOOK ("Cookery Book"),
    SCIENCE ("Science"),
    SPORTS ("Sports");

    private final String name;

    Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
