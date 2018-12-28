package com.realdolmen.shopr.domain;

public enum Subject {
    HISTORY("History"),
    COOKING("Cooking"),
    SCIENCE("Science"),
    SPORTS("Sports");


    private final String subject;

    Subject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
