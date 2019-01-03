package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FictionRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public void insert(Fiction fiction) {
        entityManager.persist(fiction);
    }

    public Fiction findById(Long id) {
        return entityManager.find(Fiction.class, id);
    }

    public void update(Fiction fiction) {
        entityManager.merge(fiction);
    }

    public void delete(Fiction fiction) {
        entityManager.remove(fiction);
    }
}