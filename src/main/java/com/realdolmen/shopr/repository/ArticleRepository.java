package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ArticleRepository extends CrudRepository<Article, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
