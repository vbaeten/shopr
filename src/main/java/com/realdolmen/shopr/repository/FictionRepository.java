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

    public Fiction findByTitle(String title) {
        return entityManager.createNamedQuery(Fiction.FIND_BY_TITLE, Fiction.class).setParameter("title", title).getSingleResult();
    }

    public void insert(Fiction fiction) {
        entityManager.persist(fiction);
    }

    public void remove(int id) {
        Fiction ById = findById(id);
        entityManager.remove(ById);
    }
}
