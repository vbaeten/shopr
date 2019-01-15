package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Rating.FIND_BY_ARTICLE,
                        query = "SELECT r FROM Rating r where r.article = :article"
                ),
                @NamedQuery(
                        name = Rating.FIND_BY_ARTICLE_ID,
                        query = "SELECT r FROM Rating r where r.article.id = :id"
                )
        })
public class Rating {
    public static final String FIND_BY_ARTICLE = "Rating.findByArticle";
    public static final String FIND_BY_ARTICLE_ID = "Rating.findByArticleId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Min(0)
    @Max(10)
    int score;

    String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    User user;

    @ManyToOne
    Article article;

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
