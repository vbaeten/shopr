package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Bestelling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BestellingsRepository
{
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Bestelling findById(int id) {
        return entityManager.find(Bestelling.class, id);
    }

//    public List<Bestelling> findAll() {
//        return entityManager.createNamedQuery(Bestelling.FIND_ALL, Bestelling.class).getResultList();
//    }
//

    public void insert(Bestelling bestelling) {
        entityManager.persist(bestelling);
    }

    public void delete (Bestelling bestelling )
    {
        entityManager.remove(bestelling);
    }

    public void update(Bestelling bestelling)
    {
        entityManager.merge(bestelling);
    }

}
