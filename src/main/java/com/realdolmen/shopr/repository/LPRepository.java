package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LPRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public LP findByArticleId(Long articleId) {
        return entityManager.find(LP.class, articleId);
    }

    public List<LP> findAll() {
        return entityManager.createQuery("select f from LP f ", LP.class).getResultList();
    }

    public LP findByTitle(String title) {
        return entityManager.createQuery(" select f from LP f where f.title =: title", LP.class).getSingleResult();
    }

    public void insert(LP lP) {entityManager.persist(lP);
    }

    public void removeLP(LP lP){
        entityManager.remove(lP);
    }
}
