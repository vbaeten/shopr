package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Rating;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RatingRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Rating findById(int id){
        return entityManager.find(Rating.class, id);
    }

    public List<Rating> findByArticle(Article article){
        return entityManager.createNamedQuery(Rating.FIND_BY_ARTICLE_ID,Rating.class).setParameter("article", article).getResultList();
    }

    public List<Rating> findByArticleId(int id){
        return entityManager.createNamedQuery(Rating.FIND_BY_ARTICLE_ID,Rating.class).setParameter("id", id).getResultList();
    }

    public void insert(Rating rating, int id){
        Article article = entityManager.find(Article.class, id);
        rating.setArticle(article);
        entityManager.persist(rating);
    }

}
