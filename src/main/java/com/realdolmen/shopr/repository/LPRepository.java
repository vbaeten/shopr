package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LPRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public LP findById(Long id) {
        return entityManager.find(LP.class, id);
    }

    public List<LP> findAll() {
        return entityManager.createQuery("select l from LP l", LP.class).getResultList();
    }

    public void save(LP lp) {
        entityManager.persist(lp);
    }

    public LP findByTitle(String title) {
        return entityManager.createQuery("select l from LP l where l.title = :title", LP.class).getSingleResult();
    }
}
