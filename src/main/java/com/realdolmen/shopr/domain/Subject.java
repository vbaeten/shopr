package com.realdolmen.shopr.domain;

public enum Subject {
    HISTORY("History"),
    COOKING("Cooking"),
    SCIENCE("Science"),
    SPORTS("Sports");


    private final String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
