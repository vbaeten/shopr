package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.websocket.OnClose;

public class Rating {

    @Id
    private int id;

    //TODO van 0 tot 10
    @Column(name = "score")
    private int score;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private User user;

    @Column(name = "article")
    private Article article;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
