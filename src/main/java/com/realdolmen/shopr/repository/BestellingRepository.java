package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Bestelling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BestellingRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Bestelling findById(int id) {
        return entityManager.createNamedQuery(Bestelling.FIND_BY_ID, Bestelling.class).getSingleResult();
    }

    public List<Bestelling> findAll() {
        return entityManager.createNamedQuery(Bestelling.FIND_ALL, Bestelling.class).getResultList();
    }

    public List <Bestelling> findByUserId(int id) {
        return entityManager.createNamedQuery(Bestelling.FIND_BY_USER_ID, Bestelling.class).setParameter("id", id).getResultList();
    }

    public void insert(Bestelling bestelling) {
        entityManager.persist(bestelling);
    }

    public void remove(int id) {
        Bestelling bestellingById = findById(id);
        entityManager.remove(bestellingById);
    }

}
