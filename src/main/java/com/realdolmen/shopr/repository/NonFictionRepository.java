package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class NonFictionRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public void insert(NonFiction nonFiction) {
        entityManager.persist(nonFiction);
    }

    public NonFiction findById(Long id) {
        return entityManager.find(NonFiction.class, id);
    }

    public void update(NonFiction nonFiction) {
        entityManager.merge(nonFiction);
    }

    public void delete(NonFiction nonFiction) {
        entityManager.remove(nonFiction);
    }
}