package com.realdolmen.shopr.domain;

public enum ArticleTypes {
    GAME("game"),
    LP("lp"),
    FICTION("fiction"),
    NONFICTION("non fiction");


    private String articleType;

    ArticleTypes(String articleType) {
        this.articleType = articleType;
    }

    public String getarticleType() {
        return articleType;
    }

    public void setarticleType(String articleType) {
        this.articleType = articleType;
    }
}
