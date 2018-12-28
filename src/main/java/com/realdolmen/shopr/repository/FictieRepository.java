package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fictie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FictieRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Fictie findById(int id) {
        return entityManager.find(Fictie.class, id);
    }

    public List<Fictie> findAll() {
        return entityManager.createNamedQuery(Fictie.FIND_ALL, Fictie.class).getResultList();
    }

    public Fictie findByTitle(String title) {
        return entityManager.createNamedQuery(Fictie.FIND_BY_TITLE, Fictie.class).setParameter("title", title).getSingleResult();
    }

    public void insert(Fictie fictie) {
        entityManager.persist(fictie);
    }

    public void remove(int id) {
        Fictie ById = findById(id);
        entityManager.remove(ById);
    }
}
