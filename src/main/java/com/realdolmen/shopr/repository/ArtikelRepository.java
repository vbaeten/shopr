package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Artikel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ArtikelRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Artikel findById(int id) {
        return entityManager.find(Artikel.class, id);
    }

    public List<Artikel> findAll() {
        return entityManager.createNamedQuery(Artikel.FIND_ALL, Artikel.class).getResultList();
    }

    public Artikel findByTitle(String title) {
        return entityManager.createNamedQuery(Artikel.FIND_BY_TITLE, Artikel.class).setParameter("title", title).getSingleResult();
    }

    public void insert(Artikel artikel) {
        entityManager.persist(artikel);
    }

    public void remove(int id) {
        Artikel artikelById = findById(id);
        entityManager.remove(artikelById);
    }


}
