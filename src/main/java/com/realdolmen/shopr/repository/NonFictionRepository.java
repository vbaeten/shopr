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

    public NonFiction findByTitle(String title) {
        return entityManager.createNamedQuery(NonFiction.FIND_BY_TITLE, NonFiction.class).setParameter("title", title).getSingleResult();
    }

    public void insert(NonFiction nonFiction) {
        entityManager.persist(nonFiction);
    }

    public void remove(int id) {
        NonFiction ById = findById(id);
        entityManager.remove(ById);
    }
}
