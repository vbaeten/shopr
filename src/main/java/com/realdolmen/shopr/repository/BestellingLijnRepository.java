package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.BestellingLijn;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BestellingLijnRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public BestellingLijn findById(int id) {
        return entityManager.createNamedQuery(BestellingLijn.FIND_BY_ID, BestellingLijn.class).getSingleResult();
    }

    public List<BestellingLijn> findAll() {
        return entityManager.createNamedQuery(BestellingLijn.FIND_ALL, BestellingLijn.class).getResultList();
    }

    public List <BestellingLijn> findByBestellingId(int id) {
        return entityManager.createNamedQuery(BestellingLijn.FIND_BY_BESTELLING_ID, BestellingLijn.class).setParameter("id", id).getResultList();
    }

    public void insert(BestellingLijn bestellingLijn) {
        entityManager.persist(bestellingLijn);
    }

    public void removeById(int id) {
        BestellingLijn bestellingLijnById = findById(id);
        entityManager.remove(bestellingLijnById);
    }

}
