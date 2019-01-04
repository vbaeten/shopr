package com.realdolmen.shopr.domain;


import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


public class Review {

    @Id
    private int id;

    @Min(0)
    @Max(10)
    private short score;

    private String description;

    private User user;
    private Item item;


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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
