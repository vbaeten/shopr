package com.realdolmen.shopr.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {

    @Id
    private int id;
    private short score;
    private String description;
    private User user;
    private Article article;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
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
