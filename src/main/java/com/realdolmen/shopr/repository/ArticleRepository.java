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
}
