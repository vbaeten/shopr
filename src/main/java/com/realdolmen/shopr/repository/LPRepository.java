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
