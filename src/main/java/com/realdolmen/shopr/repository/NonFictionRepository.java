package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class NonFictionRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public NonFiction findById(int id) {
        return entityManager.find(NonFiction.class, id);
    }

    public List<NonFiction> findAll() {
        return entityManager.createNamedQuery(NonFiction.FIND_ALL, NonFiction.class).getResultList();
    }

    public void insertNonFiction(NonFiction nonFiction) {
        entityManager.persist(nonFiction);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.getReference(NonFiction.class, id));
    }
}
