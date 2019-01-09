package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FictionRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Fiction findById(Long id) { return entityManager.find(Fiction.class, id); }

    public List<Fiction> findAll() {
        return entityManager.createQuery("select f from Fiction f", Fiction.class).getResultList();
    }

    public void save(Fiction fiction) { entityManager.persist(fiction); }

    public Fiction findByTitle(String title) {
        return entityManager.createQuery("select f from Fiction f where f.title = :title", Fiction.class).getSingleResult();
    }

    public Fiction findByAuthor(String author) {
        return entityManager.createQuery("select f from Fiction f where f.author = :author", Fiction.class).getSingleResult();
    }
}
