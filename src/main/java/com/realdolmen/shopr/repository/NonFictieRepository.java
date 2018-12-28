package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFictie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class NonFictieRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public NonFictie findById(int id) {
        return entityManager.find(NonFictie.class, id);
    }

    public List<NonFictie> findAll() {
        return entityManager.createNamedQuery(NonFictie.FIND_ALL, NonFictie.class).getResultList();
    }

    public NonFictie findByTitle(String title) {
        return entityManager.createNamedQuery(NonFictie.FIND_BY_TITLE, NonFictie.class).setParameter("title", title).getSingleResult();
    }

    public void insert(NonFictie nonFictie) {
        entityManager.persist(nonFictie);
    }

    public void remove(int id) {
        NonFictie ById = findById(id);
        entityManager.remove(ById);
    }
}
