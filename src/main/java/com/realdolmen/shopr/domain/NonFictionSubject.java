package com.realdolmen.shopr.domain;

public enum NonFictionSubject {
    HISTORY("history"),
    COOKING("cooking"),
    SCIENCE("science"),
    SPORTS("sports");


    private String nonFictionSubject;


    NonFictionSubject(String nonFictionSubject) {
        this.nonFictionSubject = nonFictionSubject;
    }

    public String getNonFictionSubject() {
        return nonFictionSubject;
    }

    public void setNonFictionSubject(String nonFictionSubject) {
        this.nonFictionSubject = nonFictionSubject;
    }

}
