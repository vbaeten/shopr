package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FictionRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Fiction findById(int id) {
        return entityManager.find(Fiction.class, id);
    }

    public List<Fiction> findAll() {
        return entityManager.createNamedQuery(Fiction.FIND_ALL, Fiction.class).getResultList();
    }

    public void insertFiction(Fiction fiction) {
        entityManager.persist(fiction);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.getReference(Fiction.class, id));
    }
}
