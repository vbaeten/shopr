package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Rating;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RatingRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Rating findByUsername(String username) {
        return entityManager.createQuery("select r from Rating r where r.user.firstName = :username", Rating.class).getSingleResult();
    }

    public Rating findByScore(int score) {
        return entityManager.createQuery("select r from Rating r where r.score = :score", Rating.class).getSingleResult();
    }

    public void save(Rating rating) {
        entityManager.persist(rating);
    }
}
