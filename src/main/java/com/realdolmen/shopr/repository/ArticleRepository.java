package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ArticleRepository extends CrudRepository<Article, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

//    public BookFiction findByTitle(String title) {
//        return entityManager.createQuery(" select f from BookFiction f where f.title =: title", BookFiction.class).getSingleResult();
//    }
//
//    public void insert(BookFiction bookFiction) {
//        entityManager.persist(bookFiction);
//    }
}
