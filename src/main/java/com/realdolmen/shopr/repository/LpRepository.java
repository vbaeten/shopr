package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Lp findById(int id){ return entityManager.find(Lp.class, id); }

    public List<Lp> findAll() {
        return entityManager.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }

    public Lp findByTitle(String title) {
        return entityManager.createNamedQuery(Lp.FIND_BY_TITLE, Lp.class).setParameter("name", title).getSingleResult();
    }

    public void insert(Lp lp) {
        entityManager.persist(lp);
    }

    public void delete (int id){
        Lp lp = entityManager.find(Lp.class, id);
        entityManager.remove(lp);
    }

    public void update(Lp lp){
        entityManager.merge(lp);
    }

}
