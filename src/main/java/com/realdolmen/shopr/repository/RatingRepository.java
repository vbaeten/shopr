package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Rating;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RatingRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Rating findById(Long id) {
        return entityManager.find(Rating.class, id);
    }

    public List<Rating> findAll() {
        return entityManager.createQuery("select f from Rating f ", Rating.class).getResultList();
    }

    public void insert(Rating rating) {entityManager.persist(rating);
    }



}
