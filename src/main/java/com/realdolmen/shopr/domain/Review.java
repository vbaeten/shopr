package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "review")
@NamedQueries(
        {
                @NamedQuery(
                        name = Review.FIND_BY_SCORE,
                        query = "SELECT b FROM Review b WHERE b.score = :score"
                ),
                @NamedQuery(
                        name = Review.FIND_ALL,
                        query = "SELECT b FROM Review b"
                )
        }
)
public class Review {
    public static final String FIND_ALL = "Review.findAll";
    public static final String FIND_BY_SCORE = "Review.findByScore";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Min(0)
    @Max(10)
    @Column(name = "score")
    private int score;
    @Column(name = "description")
    private String description;

    @ManyToOne
    private User user;
    @ManyToOne
    private Article article;


    public int getId() {
        return id;
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
