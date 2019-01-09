package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.websocket.OnClose;

@Entity
@Table(name="rating")
public class Rating {

    @Id
    @GeneratedValue
    private int id;

    //TODO van 0 tot 10
    @Column
    @Min(0)
    @Max(10)
    private int score;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name="user_fk")
    private User user;

    @ManyToOne
    @JoinColumn(name="article_fk")
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

}
