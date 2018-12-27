package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    @Min(0)
    @Max(10)
    private Integer score;

    @Column
    private String description;

   @ManyToOne
    private User user;

   @ManyToOne
    private Article article;

   public Rating() {

   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
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
