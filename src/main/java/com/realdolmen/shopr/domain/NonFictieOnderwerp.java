package com.realdolmen.shopr.domain;

public enum NonFictieOnderwerp {
    GESCHIEDENIS ("geschiedenis"),
    KOOKBOEK ("kookboek"),
    WETENSCHAP ("wetenschap"),
    SPORT ("sport");

    private String nonFictieOnderwerp;

    NonFictieOnderwerp(String nonFictieOnderwerp) {
        this.nonFictieOnderwerp = nonFictieOnderwerp;
    }

    public String getNonFictieOnderwerp() {
        return nonFictieOnderwerp;
    }

    public void setNonFictieOnderwerp(String nonFictieOnderwerp) {
        this.nonFictieOnderwerp = nonFictieOnderwerp;
    }

}
